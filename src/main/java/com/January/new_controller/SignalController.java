package com.January.new_controller;

import com.January.service.SignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignalController {

    @Autowired
    SignalService signalService;

    @RequestMapping("/helloFromSignal")
    String massage(){
        return signalService.MsgSignalService();
    }
}
