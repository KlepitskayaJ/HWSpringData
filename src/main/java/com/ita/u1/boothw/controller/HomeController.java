package com.ita.u1.boothw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getLandingPage(Model model){
        return "landingPage";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}