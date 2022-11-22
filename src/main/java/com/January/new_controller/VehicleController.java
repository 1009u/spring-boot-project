package com.January.new_controller;

import com.January.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/addViaCont", method = RequestMethod.GET)
    public double addYear(){
        return vehicleService.priceVehicle();
    }
}
