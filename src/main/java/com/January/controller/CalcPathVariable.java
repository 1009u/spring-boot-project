package com.January.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcPathVariable {

    //Addition Method EndPoint 1
    @RequestMapping("/addition/{a}/{b}")
    public int Addition(@PathVariable int a, @PathVariable int b){
        int add=a+b;
        return add;
    }
    //Subtract Method EndPoint 2
    @RequestMapping("/subtract/{a}/{b}")
    public int Subtract(@PathVariable int a, @PathVariable int b){
        int sub=a-b;
        return sub;
    }
    //Multiply Method EndPoint 3
    @RequestMapping("/multiply/{a}/{b}")
    public int Multiply(@PathVariable int a,@PathVariable int b){
        int multi=a*b;
        return multi;
    }
    //Divide Method EndPoint 4
    @RequestMapping("/division/{a}/{b}")
    public int Divide(@PathVariable int a,@PathVariable int b){
        int div=a/b;
        return div;

    }
}
