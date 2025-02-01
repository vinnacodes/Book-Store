package com.vinna.bookstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
 class ViewController {


    @GetMapping("/home")
    public String home(){


        return "home";
    }


}
