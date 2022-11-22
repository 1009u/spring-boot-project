package com.January.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
public class AppRepository {

    @RequestMapping(value = "/helloRepo",method = RequestMethod.GET)
    public String RepoMsg(){
        return "Response From Application Repository Class...";
    }
}
                    //Stereo Type Project