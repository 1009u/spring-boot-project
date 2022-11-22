package com.January.controller;

import com.January.model.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class ControllerPlayerModel {
    //I am trying here HashMap Model
    HashMap<Integer, Player> team_Player=new HashMap<>();
    Player player1=new Player("Kohli",10,"India");
    Player player2=new Player("Steve Smith",21,"Australia");

    //add player
    @RequestMapping("/added_Player")
    public String addPlayer(){
        team_Player.put(1,player1);
        team_Player.put(2,player2);
        return "Player Added Now....";
    }
    //get all players Data
    @RequestMapping("/get_Players")
    public HashMap<Integer, Player> getPlayer(){
        return team_Player;
    }

    //Set or Update   ..................... It is Not working ,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    @RequestMapping("/set_NameOfPlayer")
    public String setPlayer_Name(){
        Player player1=team_Player.get(0);
        player1.setName("Shardul Thakur");
        return team_Player.get(0).getName()+"Name has Updated...";
    }
    //remove of Player
    @RequestMapping("/Remove_Player")
    public String removePlayer(){
        team_Player.remove(1);
        return "Player has removed...";
    }

}
