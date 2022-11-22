package com.January.controller;

import com.January.model.Bag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControllerBagModel {
    //we will perform her add , get , set and remove actions
    ArrayList<Bag> types_Bag=new ArrayList<>();

    //add of Bags types
    @RequestMapping("/Add_Bags")
    public String addBag(){
        Bag bag1=new Bag("Zycoon",34,1299.99);
        types_Bag.add(bag1);
        //bag 2
        Bag bag2=new Bag("Nike",35,2499.55);
        types_Bag.add(bag2);
        return "Bag Variety added Now......";
    }

    //get all data
    @RequestMapping("/Get_Bags")
    public ArrayList<Bag> getBags(){
        return types_Bag;
    }

    //set or update details of Bag
    @RequestMapping("/Set_Bag's_details")
    public String updateBagInfo(){
        Bag bag1=types_Bag.get(0);
        bag1.setCompany("Puma");
        return types_Bag.get(0).getCompany()+"....Company Name Update Successfully.";
    }

    //remove or Delete Data of Bag Model
    @RequestMapping("/Remove_Bag")
    public String removeBag(){
        types_Bag.remove(1);
        return "Bag Data of This Index is removed .....";
    }

}
