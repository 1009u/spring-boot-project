package com.January.service;

import com.January.repository.SignalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SignalService {
    @Autowired
    SignalRepository signalRepository;

    @RequestMapping("/helloFromService")
    public String MsgSignalService(){
        return signalRepository.MsgSignalRepository();
    }
}
