package com.January.service;

import com.January.repository.MobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class MobService {
    @Autowired
    MobRepository mobRepository;

    @RequestMapping(value = "/hello_Service",method = RequestMethod.GET)
    public String ResMobSer(){
        return mobRepository.RespMobRep();
    }
}
