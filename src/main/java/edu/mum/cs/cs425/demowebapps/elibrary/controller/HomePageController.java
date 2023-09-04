package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {

    @GetMapping(value = {"/", "/elibrary","/elibrary/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
