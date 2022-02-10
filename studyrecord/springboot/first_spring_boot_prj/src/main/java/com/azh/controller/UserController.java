package com.azh.controller;

import com.azh.config.Book;
import com.azh.config.User;
import com.azh.config.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private User user;

    @Autowired
    private Users users;

    @GetMapping("/user")
    public String book(){
        System.out.println("--------" + user.toString());
        System.out.println("--------" + users.toString());
        return user.toString() + users.toString();
    }
}
