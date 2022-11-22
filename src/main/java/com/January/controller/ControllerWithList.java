package com.January.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
@RestController
public class ControllerWithList {

    //access specifier  return type  method name (){}
    @RequestMapping("/indianCity")
    public List<String> cityName(){
    //Array List: ArrayList <Data_Type> object_name=new ArrayList <Data_Type>();
        ArrayList <String> city=new ArrayList<>();
        city.add("Kanpur");
        city.add("Jaipur");
        city.add("Agra");
        city.add("Goa");

        return city;
    }
    // HashSet List print
    @RequestMapping("/Team_Score_At_This_Ground")
    public HashSet<Integer> score(){
        HashSet<Integer> team_Score=new HashSet<>();

        team_Score.add(345);
        team_Score.add(299);
        team_Score.add(299);
        team_Score.add(345);
        team_Score.add(489);

        return team_Score;
    }
    //HashMap List Print
    @RequestMapping("/Lessons_Of_Book")
    public HashMap<Integer,String> Book_Index(){
        HashMap <Integer,String> index=new HashMap<>();

        //put values
        index.put(1,"Prayer");
        index.put(2,"True Friendship");
        index.put(3,"Constitution");
        index.put(4,"Good Manners");
        //get values
        index.get(1);
        index.get(2);
        index.get(3);
        index.get(4);
        //return
        return index;

    }
}
