package com.ithei.controller;

import com.ithei.entity.User;
import com.ithei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/dsf")
    public List<User> show(){

        return userService.findAll();
    }

}
