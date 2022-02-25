package tp0.Ex2;


import java.util.List;

public class Cercle extends FigureBis {
 
    /**
     * Définition d'un cercle par son centre, et un point appartenant au cercle
     * @param centre
     * @param surLeCercle
     */
    public Cercle(String couleurBordure,String couleurFond,List<Point> coordonnees){
        super(couleurBordure,couleurFond,coordonnees);
        
    }
    
    public double getRayon() {
        return coordonnees.get(0).distance(coordonnees.get(1));
    }
    
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println( " . Cercle definit par son centre : "+ (coordonnees.get(0).infoPoint())
                            + " et son rayon : " + getRayon());
    }
}
