/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.util.ImageUtils;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
@Path("image")
public class ImageResource {
    
    @Inject
    private transient Logger log; 
    
    @Inject
    private ImageUtils imageUtils; 
    
    @Consumes("multipart/form-data")
    @Produces("image/png")
    @GET
    public Response getImage(@HeaderParam(value = "Bearer") String token, 
                             InputStream is){
        Response payload = null; 
        if(token == null){
            //no image can be returned
            payload = Response.status(Response.Status.BAD_REQUEST)
                    .build(); 
        }else{
            //get the image
            BufferedImage image = imageUtils.readImage(token); 
            //write the image to an output stream
            ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
            try{
                ImageIO.write(image, "png", stream); 
                payload = Response.ok(stream)
                        .build(); 
            }catch(IOException ex){
                
            }
        }
        
        return payload; 
    }
}
