package com.January.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalC {

    //add method EndPoint 1
    @RequestMapping("/Addition_a&b")
    public int Addition(){
        int a=23;
        int b=25;
        int add=a+b;
        return add;
    }
    //subtract EndPoint 2
    @RequestMapping("/Subtract_A&B")
    public int Subtract(){
        int a=7654;
        int b=7465;
        int sub=a-b;
        return sub;
    }
    //multiply EndPoint 3
    @RequestMapping("/Multiply_A&B")
    public int Multiply(){
        int a=35;
        int b=36;
        int multi=a*b;
        return multi;
    }
    //Divide EndPoint 4
    @RequestMapping("/Division_A&B")
    public int Divide(){
        int a=7654;
        int b=2;
        int div=a/b;
        return div;
    }
}
