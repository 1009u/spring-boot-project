package com.January.controller;

import com.January.model.SoftDrink;
import com.January.repository.SoftDrinkJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SoftDrinkDataBaseController {

    @Autowired
    //JpaRepositoryClassName Variable Name;
    SoftDrinkJpaRepository drinkJpaRepository;

    //add method
    @RequestMapping(value="/add_SoftDrink_Type", method = RequestMethod.POST)
    public SoftDrink addSoftDrink(@RequestBody SoftDrink softdrink){
        return drinkJpaRepository.save(softdrink);
    }
    // save new variables' method by Put
    @RequestMapping(value = "/addNewSoftDrink",method = RequestMethod.PUT)
    public SoftDrink putSoftDrink(@RequestBody SoftDrink softDrink){
        return drinkJpaRepository.save(softDrink);
    }
    //get method
    @RequestMapping(value = "/get_all",method = RequestMethod.GET)
    public List<SoftDrink> getSoftDrink(){
        return drinkJpaRepository.findAll();
    }
    //Remove
    @RequestMapping(value = "/delete_SoftDrink",method = RequestMethod.DELETE)
    public void removeSoftDrink(@RequestParam Long id){
        drinkJpaRepository.deleteById(id);
    }
}
