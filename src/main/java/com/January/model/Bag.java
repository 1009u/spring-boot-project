package com.January.model;

public class Bag {
    //properties
    String company;
    int storage;
    double prince;

    //create constructor
    public Bag(String company, int storage, double prince) {
        this.company = company;
        this.storage = storage;
        this.prince = prince;
    }
    //create getter and setter


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

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }
}
