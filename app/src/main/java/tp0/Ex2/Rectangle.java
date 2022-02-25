package tp0.Ex2;

import java.util.*;

public class Rectangle extends FigureBis {
    /**
     * Définition d'un rectangle par les extrémités d'une des diagonales
     * @param basGauche
     * @param hautDroit
     */
    public Rectangle(String couleurBordure,String couleurFond,List<Point> coordonnees){
        super(couleurBordure,couleurFond,coordonnees);
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println( " . Rectangle definit par les points bas gauche : " + 
                            (coordonnees.get(0).infoPoint()) +
                            " et haut droit " + (coordonnees.get(1).infoPoint())
                            );
    }
}
