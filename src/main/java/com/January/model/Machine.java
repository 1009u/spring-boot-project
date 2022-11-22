package com.January.model;

public class Machine {
    //Properties of Machine
   String brand_of_machine;
   String import_from;
   double price_with_GST;

   //Create constructor
    public Machine(String brand_of_machine, String import_from, double price_with_GST) {
        this.brand_of_machine = brand_of_machine;
        this.import_from = import_from;
        this.price_with_GST = price_with_GST;
    }

    //Create Getter and Setter
    public String getBrand_of_machine() {
        return brand_of_machine;
    }

    public void setBrand_of_machine(String brand_of_machine) {
        this.brand_of_machine = brand_of_machine;
    }

    public String getImport_from() {
        return import_from;
    }

    public void setImport_from(String import_from) {
        this.import_from = import_from;
    }

    public double getPrice_with_GST() {
        return price_with_GST;
    }

    public void setPrice_with_GST(double price_with_GST) {
        this.price_with_GST = price_with_GST;
    }
}
