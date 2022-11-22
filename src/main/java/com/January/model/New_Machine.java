package com.January.model;

public class New_Machine {
    //properties
    String new_machine_name;
    String imported_country;
    double actual_price_with_GST;
    //constructor
    public New_Machine(String new_machine_name, String imported_country, double actual_price_with_GST) {
        this.new_machine_name = new_machine_name;
        this.imported_country = imported_country;
        this.actual_price_with_GST = actual_price_with_GST;
    }
    //getter and setter
    public String getNew_machine_name() {
        return new_machine_name;
    }

    public void setNew_machine_name(String new_machine_name) {
        this.new_machine_name = new_machine_name;
    }

    public String getImported_country() {
        return imported_country;
    }

    public void setImported_country(String imported_country) {
        this.imported_country = imported_country;
    }

    public double getActual_price_with_GST() {
        return actual_price_with_GST;
    }

    public void setActual_price_with_GST(double actual_price_with_GST) {
        this.actual_price_with_GST = actual_price_with_GST;
    }
}
