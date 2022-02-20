package tp0.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Rectangle extends Figure {
    /**
     * Définition d'un rectangle par les extrémités d'une des diagonales
     * @param basGauche
     * @param hautDroit
     */
    public Rectangle(Point basGauche , Point hautDroit){
        coordonnees = new ArrayList<>(Arrays.asList(basGauche,hautDroit));
    }
}
