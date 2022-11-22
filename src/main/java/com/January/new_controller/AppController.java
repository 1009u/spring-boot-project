package com.January.new_controller;

import com.January.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    AppService appService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String massage(){
        return appService.ServiceMsg();
    }
}

                //Stereo Type Project
