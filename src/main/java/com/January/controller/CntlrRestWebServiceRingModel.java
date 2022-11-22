package com.January.controller;

import com.January.model.Ring;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class CntlrRestWebServiceRingModel {
    //we will write code here with Rest Web Service and User Define(Dynamically)
    ArrayList<Ring> ringArrayList=new ArrayList<>();

    //Note We will use Value and method for restriction of method
    //Syntax:@RequestMapping(value="/Name of Mapping",method = RequestMethod.POST/GET/DELETE/PUT)

    //for add rings types
    @RequestMapping(value="/add_ring_data",method = RequestMethod.POST)
    public String addRings(@RequestBody Ring ring){
        ringArrayList.add(ring);
        return "Ring Added Successfully....";
    }
    //for get all
    @RequestMapping(value="/get_ring_data",method = RequestMethod.GET)
    public ArrayList<Ring> getRings(){
        return ringArrayList;
    }
    //for update or Set
    @RequestMapping(value = "/set_Metal_Name",method = RequestMethod.PUT)
    public String setRingMetal(){
        Ring ring1=ringArrayList.get(0);
        ring1.setMetal("Platinum");
        return ringArrayList.get(0).getMetal()+"  Ring's Metal Name Updated Successfully...";
    }
    //for remove
    @RequestMapping(value = "/remove_Ring",method = RequestMethod.DELETE)
    public String removeRing(){
        ringArrayList.remove(0);
        return "Ring Or index 0 has deleted .....";
    }
}
