/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.factory;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author MACARENA
 */
public class LoggerFactory {
    @Produces
    public Logger getLogger(InjectionPoint ip){
        return Logger.getLogger(ip.getMember().getDeclaringClass().getName()); 
    }
}
