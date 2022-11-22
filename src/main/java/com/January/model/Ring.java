package com.January.model;

public class Ring {
    //properties
    String metal;
    int weight_of_gram;
    double price_of_ring;

    public Ring(String metal, int weight_of_gram, double price_of_ring) {
        this.metal = metal;
        this.weight_of_gram = weight_of_gram;
        this.price_of_ring = price_of_ring;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getWeight_of_gram() {
        return weight_of_gram;
    }

    public void setWeight_of_gram(int weight_of_gram) {
        this.weight_of_gram = weight_of_gram;
    }

    public double getPrice_of_ring() {
        return price_of_ring;
    }

    public void setPrice_of_ring(double price_of_ring) {
        this.price_of_ring = price_of_ring;
    }
}
