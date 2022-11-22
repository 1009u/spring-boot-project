package com.January.service;

import com.January.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class AppService {
    @Autowired
    AppRepository appRepository;
    @RequestMapping(value = "/helloService",method = RequestMethod.GET)
    public String ServiceMsg(){
        return appRepository.RepoMsg();
    }
}
                    //Stereo Type Project
