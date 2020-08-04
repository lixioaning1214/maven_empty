package com.lxn.controller;

import com.lxn.pojo.User;
import com.lxn.service.UserService;
import com.lxn.service.impl.UserServiceImpl;

public class UserController {

    private final UserService userService = new UserServiceImpl();

    public String login () {
        User login = userService.login(new User());
        if (login!=null) {
            return "success";
        }
        return "error";
    }
}
