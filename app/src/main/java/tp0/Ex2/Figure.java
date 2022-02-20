package tp0.Ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    private String couleurFond;
    private String couleurBordure;
    protected List<Point> coordonnees = new ArrayList<>();
    
    public List<Point> getCoordonnees() {
        return coordonnees;
    }
    public String getCouleurBordure() {
        return couleurBordure;
    }
    public String getCouleurFond() {
        return couleurFond;
    }
    public void setCoordonnees(List<Point> coordonnees) {
        this.coordonnees = coordonnees;
    }
    public void setCouleurBordure(String couleurBordure) {
        this.couleurBordure = couleurBordure;
    }
    public void setCouleurFond(String couleurFond) {
        this.couleurFond = couleurFond;
    }
}
