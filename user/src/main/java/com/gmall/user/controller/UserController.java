package com.gmall.user.controller;

import com.gmall.user.service.UserService;
import com.gmall.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello springboot";
    }
}
