package com.interlink.course.natural;


/**
 * Created by Яна on 03.07.2017.
 */
public class Rose extends Natural {
    private Double price;

    public Rose() {
        getPrice();
        setColor();
    }

    @Override
    public Double getPrice() {
        return price=16.0;
    }
}

