package com.interlink.course;

import java.util.ArrayList;

/**
 * Created by Яна on 03.07.2017.
 */
public class Bouquet extends ArrayList<Flower> {
    public Double getBouquetPrice(){
        Double totalPrice=0.0;
        for (Flower f : this) {
            totalPrice = totalPrice+(f.getPrice());
        }
        return totalPrice;
    }
}
