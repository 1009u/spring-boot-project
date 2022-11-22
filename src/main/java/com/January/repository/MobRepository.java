package com.January.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MobRepository {

    public String RespMobRep(){
        System.out.println("Response from Repository...");
        return null;
    }
}
