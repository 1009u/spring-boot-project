package com.January.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SoftDrink {
    String brand;
    int quantity_in_Liter;
    int price;

    @Id
    @GeneratedValue
    Long id;

    //default constructor
    public SoftDrink() {
    }

    public SoftDrink(String brand, int quantity_in_Liter, int price, Long id) {
        this.brand = brand;
        this.quantity_in_Liter = quantity_in_Liter;
        this.price = price;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity_in_Liter() {
        return quantity_in_Liter;
    }

    public void setQuantity_in_Liter(int quantity_in_Liter) {
        this.quantity_in_Liter = quantity_in_Liter;
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

