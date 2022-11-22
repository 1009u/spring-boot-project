package com.January.controller;

import com.January.model.Machine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControllerMachineModel {
    //we will perform here Add , get, update(set),remove method
    //first add machine
    ArrayList<Machine> types_of_Machine=new ArrayList<>();
                //create add method
    @RequestMapping("/add_Machine")
    public String addMachine(){
        Machine machine1=new Machine("LG","Japan",67545.45);
        types_of_Machine.add(machine1);
        return "Machine Added Successful.....";
    }
                //for get Machine
    @RequestMapping("/get_Machine")
    public ArrayList<Machine> getMachine(){
        return types_of_Machine;
    }
                // for update or Set Data of Machine
                //here we are updating Price of Machine
    @RequestMapping("/Set_Machine_Price")
    public String setMachine(){
        Machine machine1=types_of_Machine.get(0);
        machine1.setPrice_with_GST(52750.99);
        return types_of_Machine.get(0).getPrice_with_GST()+"Price Change Successfully..";
    }
                //Delete Machine Data
    @RequestMapping("/remove_Machine_Data")
    public String removeMachine(){
        types_of_Machine.remove(0);
        return "Machine Data have removed";

    }
}
