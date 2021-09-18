package de.reipka.springsecuritygithublogin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping({"/index"})
    public String home(){
        return "index";
    }

    // call with .html
    @RequestMapping({"/moin"})
    public String moin(){
        return "moin";
    }
}
