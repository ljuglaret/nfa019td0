package tp0.Ex2;

import java.util.*;

public abstract class FigureBis implements Transformable,Deplacable {

    private String couleurFond;
    private String couleurBordure;
    protected List<Point> coordonnees = new ArrayList<>();

    public FigureBis(String couleurBordure,String couleurFond,List<Point> coordonnees){
        this.couleurBordure = couleurBordure;
        this.couleurFond = couleurFond;
        this.coordonnees.addAll(coordonnees);
    }

    public List<Point> getCoordonnees() {
        return coordonnees;
    }
    public String getCouleurBordure() {
        return couleurBordure;
    }
    public String getCouleurFond() {
        return couleurFond;
    }
    
    public void setCouleurBordure(String couleurBordure) {
        this.couleurBordure = couleurBordure;
    }
    public void setCouleurFond(String couleurFond) {
        this.couleurFond = couleurFond;
    }

    @Override
    public void setCoordonnees(List<Point> coordonnees) {
                this.coordonnees = coordonnees;
    }

    /**
     * Symétrie horizontale par rapport à la droite d'équation D = y
     * @param y
     */
    @Override
    public void symetrieHorizontale(double y) {
        for (Point point : coordonnees){
            point.setY(2*y - point.getY());
        }
    }

    /**
     * Symétrie verticale par rapport à la droite d'équation D = x
     * @param x
     */
    @Override
    public void symetrieVerticale(double x ) {
        for (Point point : coordonnees){
            point.setX(2*x - point.getX());
        }
    }

    public void afficherInfo(){
       System.out.print("Couleur bordure : " + couleurBordure 
                        + " , Couleur fond : " + couleurFond);
                       
    }

   
}
