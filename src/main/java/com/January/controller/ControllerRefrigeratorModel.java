package com.January.controller;

import com.January.model.Refrigerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControllerRefrigeratorModel {
    //we will print here Refrigerator Model Detail With Array_List
    //we will perform here Four Tasks Add, Get , Update (Set) ,Delete

    //Create object of Array_List
    ArrayList <Refrigerator> kind_of_refrigerator=new ArrayList<>();
    //for Add
    @RequestMapping("/add_Refrigerator")
    public String addRefrigerator(){
        //create object of Refrigerator for add Data
        Refrigerator refrigerator1=new Refrigerator("LG",50,28795.59);
        kind_of_refrigerator.add(refrigerator1);
        Refrigerator refrigerator2=new Refrigerator("Kelvin",55,34555.99);
        kind_of_refrigerator.add(refrigerator2);

        return "Model of Refrigerator added successfully.......";
    }

    //for get
    @RequestMapping("/get_Refrigerator_Model")
    public ArrayList<Refrigerator> getRefrigerators(){
        return kind_of_refrigerator;
    }

    //for update, we will use here set method
    @RequestMapping("/Set_Refrigerator_Name")
    public String updateModelName(){
    Refrigerator refrigerator1= kind_of_refrigerator.get(0);
    refrigerator1.setBrand("Allen Cooper");
        return kind_of_refrigerator.get(0).getBrand()+"Brand Rename SuccessFully....";
    }

    //for Delete or Remove Data
    @RequestMapping("/remove_Refrigerator_Model")
    public String removeRefrigerator(){
        kind_of_refrigerator.remove(0);
        return "Allen Cooper Model Remove Successfully...";
    }
}
