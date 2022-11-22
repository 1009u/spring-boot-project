package com.January.new_controller;

import com.January.service.MobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobController {

    @Autowired
    MobService mobService;

    @RequestMapping(value="/hello_controller", method = RequestMethod.GET)
    public String RespMobCon(){
        return mobService.ResMobSer();   // most important we are calling service layer
    }
}
