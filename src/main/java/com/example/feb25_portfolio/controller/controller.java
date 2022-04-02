package com.example.feb25_portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller
{

    @GetMapping("/")
    public String landingPage(){
        return "landingPage";
    }
}
