package com.January.controller;

import com.January.model.HardDisk;
import com.January.repository.HardDiskJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardDiskController {
    //we will do here Autowiring for get all data of controller class
    @Autowired
    HardDiskJpaRepository hardDiskJpaRepository;
    //For Post
    @RequestMapping(value = "/AddHardDisk",method = RequestMethod.POST)
    public HardDisk addHardDisk(@RequestBody HardDisk hardDisk){
      return hardDiskJpaRepository.save(hardDisk);
    }
    //Get method
    @RequestMapping(value = "/GetAllData", method = RequestMethod.GET)
    public List<HardDisk> getAll(){
        return hardDiskJpaRepository.findAll();
    }
    //for Delete
    @RequestMapping(value = "/DeleteHardDisk", method = RequestMethod.DELETE)
    public void deleteHardDisk(@RequestParam Long id){
        hardDiskJpaRepository.deleteById(id);
    }

    @RequestMapping(value = "/updateHardDisk", method = RequestMethod.PUT)
    public HardDisk  update(@RequestBody HardDisk hardDisk){

        return hardDiskJpaRepository.save(hardDisk);
    }
}
