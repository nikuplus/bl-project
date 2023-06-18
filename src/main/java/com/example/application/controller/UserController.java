package com.example.application.controller;

import com.example.application.resource.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public User test(String name, String age, String sex) {
        return new User(name, age, sex);
    }
}
