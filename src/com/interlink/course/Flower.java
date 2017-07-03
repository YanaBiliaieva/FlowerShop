package com.interlink.course;

/**
 * Created by Яна on 03.07.2017.
 */
 public abstract class Flower {

    private final Double price;


    protected Flower(Double price){
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }


}
