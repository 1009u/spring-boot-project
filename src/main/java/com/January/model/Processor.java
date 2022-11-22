package com.January.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// we will create a processor class

@Entity(name = "Processor_List")
public class Processor {
    String brand;
    int core;
    int price;
    @Id
    @GeneratedValue
    Long id;

    //default constructor
    public Processor(){

    }

    public Processor(String brand, int core, int price, Long id) {
        this.brand = brand;
        this.core = core;
        this.price = price;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
