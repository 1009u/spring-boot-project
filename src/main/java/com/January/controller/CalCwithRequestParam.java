package com.January.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalCwithRequestParam {
    //addition method with EndPoint 1
    @RequestMapping("/addition")
    public int Addition(@RequestParam int a, @RequestParam int b){
        int add=a+b;
        return add;
    }
    //subtract method with EndPoint 2
    @RequestMapping("/subtract")
    public int Subtract(@RequestParam int a, @RequestParam int b){
        int sub=a-b;
        return sub;
    }
    //multiply method with EndPoint 3
    @RequestMapping("/multiply")
    public int Multiply(@RequestParam int a,@RequestParam int b){
        int multi=a*b;
        return multi;
    }
    //divide method with EndPoint 4
    @RequestMapping("/division")
    public int Division(@RequestParam int a, @RequestParam int b){
        int div=a/b;
        return div;
    }
    //String Statement Print By @PathVariable and @RequestParam

    // By  @PathVariable
    @RequestMapping("/Enter_Your_Name :/{yourName}")
    public String addYourName(@PathVariable String yourName){
        return "Hello Mr./Mrs. ........"+yourName;
    }
    //By @RequestParam
    @RequestMapping("/Enter_Your_Country")  //Note: we will give EndPoint Name simply
    public String addYourCountry(@RequestParam String country){
        return "You are Belong From ......."+country;
    }
}
