package tp0.Ex2;

import java.util.ArrayList;

import java.util.*;
public class Main {
    public static void exemple(){

        List<FigureBis> listFigures = new ArrayList<FigureBis>();

        Point c1 = new Point(1.2,4.3);
        Point c2 = new Point(1.5,6.3);
        Point c3 = new Point(8.2,3.5);
        
        Cercle cercle = new Cercle("rouge", "bleu", new ArrayList<>(Arrays.asList(c1,c2)));
        
        cercle.setCoordonnees(new ArrayList<>(Arrays.asList(c1,c3)));
        cercle.setCouleurBordure("noir");
        cercle.setCoordonnees(new ArrayList<>(Arrays.asList(c2,c1)));

        Rectangle r = new Rectangle("violet","marron" , new ArrayList<>(Arrays.asList(c2,c1)));
        r.setCoordonnees(new ArrayList<>(Arrays.asList(c2,c3)));
        r.setCoordonnees(new ArrayList<>(Arrays.asList(c1,c2)));
       r.symetrieVerticale(5.0);
       
        listFigures.add(cercle);
        listFigures.add(r);

        for(FigureBis figure : listFigures) {
           figure.afficherInfo();
            System.out.println();
        }
    }
}