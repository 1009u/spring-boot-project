package com.January.model;

public class Player {
    //Properties
    String name;
    int jersey_number;
    String country;

    public Player(String name, int jersey_number, String country) {
        this.name = name;
        this.jersey_number = jersey_number;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJersey_number() {
        return jersey_number;
    }

    public void setJersey_number(int jersey_number) {
        this.jersey_number = jersey_number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
