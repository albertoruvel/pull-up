/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author MACARENA
 */
public class ImageUtils {

    @Inject
    private transient Logger log; 
    
    public ImageUtils() {
    }
    
    
    public String saveImage(InputStream stream, String token){
        byte[] bytes = null; 
        String path = "C:\\pullup\\profile\\" + token + ".png"; 
        try{
            bytes = IOUtils.toByteArray(stream); 
            log.info("Saving image");
            IOUtils.write(token, new FileWriter(new File(path)));
        }catch(IOException ex){
            log.severe("Could not write image: " + ex.getMessage()); 
        }
        
        return path; 
    }
    
    
    public BufferedImage readImage(String token){
        String path = "C:\\pullup\\profile\\" + token + ".png"; 
        InputStream in = null; 
        BufferedImage image = null; 
        try{
            in = new FileInputStream(new File(path)); 
            image = ImageIO.read(in); 
            
        }catch(FileNotFoundException ex){
            log.severe("Could not read image: " + ex.getMessage());
        }catch(IOException ex){
            log.severe("Could not read image: " + ex.getMessage());
        }
        return image; 
    }
}
