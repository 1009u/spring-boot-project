package com.January.controller;

import com.January.model.New_Machine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Cont_for_Add_Machine {
    ArrayList<New_Machine> add_New_Machine=new ArrayList<>();
    //for add machine
    @RequestMapping("/new_Machine_added")
    public String addMachineNew(@RequestBody New_Machine new_machine){
        add_New_Machine.add(new_machine);
        return "New Machine added by You Dynamically";
    }
    //get all
    @RequestMapping("/get_Data_of_New_Machine")
    public ArrayList<New_Machine> getNewMachine(){
        return add_New_Machine;
    }
    //set or Update New Machine Data
    @RequestMapping("/update_Data_New_Machine")
    public String setNewMachineData(){
        New_Machine machine1=add_New_Machine.get(0);
        machine1.setNew_machine_name("HITACHI");
        return add_New_Machine.get(0).getNew_machine_name()+"Name Update Successfully of New Machine....";
    }
    //for remove of Delete
    @RequestMapping("/delete_New_Machine_Data")
    public String deleteMachine(){
        add_New_Machine.remove(0);
        return "Machine Data Removed......";
    }
}
