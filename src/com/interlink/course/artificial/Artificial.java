package com.interlink.course.artificial;
import com.interlink.course.Flower;

/**
 * Created by Яна on 03.07.2017.
 */
public class Artificial implements Flower {


    private ArtificialMaterial material;
    private Double price;

    public Artificial() {
       getPrice();this.material=setMaterial();

    }

    public ArtificialMaterial getMaterial() {
        return material;
    }

    public ArtificialMaterial setMaterial() {

            int	 k=(int) (Math.random()*3);
            switch (k){
                case 1:  material=ArtificialMaterial.GLASS;
                    break;
                case 2: material=ArtificialMaterial.METAL;
                    break;
                case 3: material=ArtificialMaterial.PAPER;
                    break;
                default: material=ArtificialMaterial.PAPER;

        }return material;
    }

    @Override
    public Double getPrice() {
        return price=15.0;
    }
}
