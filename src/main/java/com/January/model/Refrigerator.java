package com.January.model;

public class Refrigerator {
    //properties
    String brand;
    int liter;
    double price;

    public Refrigerator(String brand, int liter, double price) {
        this.brand = brand;
        this.liter = liter;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
