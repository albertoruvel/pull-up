/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.repository;

import com.pullup.app.entity.User;

/**
 *
 * @author MACARENA
 */
public interface UserRepository {
    public String add(User user); 
    public void update(User user);
    public User getUserByEmail(String email); 
}
