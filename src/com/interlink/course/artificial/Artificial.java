package com.interlink.course.artificial;
import com.interlink.course.Flower;

/**
 * Created by Яна on 03.07.2017.
 */
public class Artificial extends Flower {


    private ArtificialMaterial material;

    public Artificial() {
        super(20.0);
        this.material=setMaterial();

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
}
