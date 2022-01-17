package com.ita.u1.boothw.controller;

import com.ita.u1.boothw.model.User;
import com.ita.u1.boothw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

        @GetMapping(value = "/list")
        public ModelAndView getUsers() {
            List<User> users = userService.getUsers();
            ModelAndView model = new ModelAndView();
            model.setViewName("list");
            model.addObject("users", users);
            return model;
        }
}