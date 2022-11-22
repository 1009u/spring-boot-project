package com.January.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HardDisk {
    String company;
    int storage;
    int price;
    @Id
    @GeneratedValue
    Long id;
    //default Constructor
    public HardDisk(){
    }
    public HardDisk(String company, int storage, int price) {
        this.company = company;
        this.storage = storage;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
