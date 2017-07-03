package com.interlink.course.natural;

import com.interlink.course.Color;
import com.interlink.course.Flower;

/**
 * Created by Яна on 03.07.2017.
 */
public class Natural extends Flower {

    private Color color;

    protected Natural(Double price) {
        super(price);
        this.color=setColor();
    }


    public Color getColor() {
        return color;
    }

    public Color setColor() {

        int	 k=(int) (Math.random()*4);
        switch (k){
            case 1: color=Color.WHITE ;
                break;
            case 2:color=Color.MULTICOLOR;
                break;
            case 3: color=Color.RED;
                break;
            case 4: color=Color.YELLOW;
                break;
            default:color=Color.YELLOW;
        }return color;
    }
}
