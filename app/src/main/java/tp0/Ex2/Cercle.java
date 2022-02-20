package tp0.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Cercle extends Figure {
 
    /**
     * Définition d'un cercle par son centre, et un point appartenant au cercle
     * @param centre
     * @param surLeCercle
     */
    public Cercle(Point centre, Point surLeCercle){
        coordonnees = new ArrayList<>(Arrays.asList(centre,surLeCercle));
    }
    
    public double getRayon() {
        return coordonnees.get(0).distance(coordonnees.get(1));
    }
    
}
