package com.January.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //end point 1 for Console.K
    @RequestMapping("/hello")
    public void printvalue(){
        System.out.println("Welcome in Console...");
    }
    //end point2 for Screen
    @RequestMapping("/hello_screen")
    public String printvalueforscreen(){
        return "Welcome Spring Boot on Screen......";
    }
}
