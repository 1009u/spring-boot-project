package com.January.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class SignalRepository {

    @RequestMapping("/helloFromRepo")
    public String MsgSignalRepository(){
        return "Hello From Repository Class.";
    }
}
