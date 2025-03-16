package com.alvieri.SimpleBuisnessApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String greet(){
        return "Alvieri Hello";
    }


    @RequestMapping("/about")
    public String about(){
        return "Alvieri about";
    }


}
