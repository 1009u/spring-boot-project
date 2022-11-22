package com.January.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
public class VehicleRepository {

    @RequestMapping(value = "/fromVehicle", method = RequestMethod.GET)
    public Integer msgFromRepo(){
        return 1994;
    }
}
