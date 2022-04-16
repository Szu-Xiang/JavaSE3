package com.HomeWork;

public class TV extends Electrical {

    private double size;
    private String fb;

    public TV() {

    }

    public TV(String brand, String number, String color, int price) {
        super(brand, number, color, price);
    }
}
