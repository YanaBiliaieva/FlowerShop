package com.interlink.course.natural;

/**
 * Created by Яна on 03.07.2017.
 */
public class Camomile extends Natural{
    private Double price;
    public Camomile( ) {
        getPrice();
        setColor();
    }

    @Override
    public Double getPrice() {
        return price=15.0;
    }
}
