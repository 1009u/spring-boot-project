package com.January.service;
import com.January.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @RequestMapping(value = "/serviceVehicle", method = RequestMethod.GET)
    public String vehicleServiceMethod(){
        return "Response from Vehicle Repository Via Service Layer...."+vehicleRepository.msgFromRepo();
    }
    @GetMapping("/Price_of_Vehicle")
    public double priceVehicle(){
        return 7809937.38;
    }

}
