package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Carsten
 * Time: 09.03
 * Date: 12/03/2021
 */
@Controller
public class FoodController {

    //index page
    @GetMapping("/")
    public String renderIndex(){
        return "index.html";
    }
    @GetMapping("/index")
    public String redirectIndex(){
        return "redirect:/";
    }

    @GetMapping("/login")
    public String renderLogin(){
        return "login.html";
    }

    @GetMapping("/donate")
    public String renderDonate(){
        return "donatePage.html";
    }

    @GetMapping("/about")
    public String renderAbout(){
        return "about.html";
    }
}
