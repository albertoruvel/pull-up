/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

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
    @Consumes("multipart/form-data")
    @Produces("image/png")
    @GET
    public Response getImage(@HeaderParam(value = "Bearer") String token){
        Response payload = null; 
        if(token == null){
            //no image can be returned
            payload = Response.status(Response.Status.BAD_REQUEST)
                    .build(); 
        }else{
            //get the image
        }
        
        return payload; 
    }
}
