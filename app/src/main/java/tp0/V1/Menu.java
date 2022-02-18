package tp0.V1;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    
    private Map<String,Map<Integer,String>> menu = new HashMap<>();
    private Map<Integer,Double> prixRepas = new HashMap<>();
    private Map<Integer,Double> prixBF = new HashMap<>();
    private Map<Integer,Double> prixBFA = new HashMap<>();
    private Map<Integer,Double> prixBC = new HashMap<>();


    public void creer(){
        Map<Integer,String> repas = new HashMap<>();
        repas.put(0,"omelette");
        repas.put(1, "gratin dauphinois");
        menu.put("repas", repas);

        Map<Integer,String> boissonFroide = new HashMap<>();
        boissonFroide.put(0,"eau");
        boissonFroide.put(1,"limonade");
        menu.put("boissonFroide", boissonFroide);

        Map<Integer,String> boissonFroideA = new HashMap<>();
        boissonFroideA.put(0,"vin");
        menu.put("boissonFroideA", boissonFroideA);

        Map<Integer,String> boissonChaude = new HashMap<>();
        boissonChaude.put(0,"cafe");
        boissonChaude.put(1,"the");
        menu.put("boissonChaude", boissonChaude);
    }

    public void prixRepas(){
        prixRepas.put(0,12.50);
        prixRepas.put(1,15.20);
    }

    public void prixBoissonFroide(){
        prixBF.put(0,5.0);
        prixBF.put(1,5.4);
    }

    public void prixBoissonChaude(){
        prixBF.put(0,2.0);
        prixBF.put(1,1.4);
    }


    public void prixBoissonFroideA(){
        prixBFA.put(0,7.25);
    }

    public void prixBoissonsChaudes(){
        prixBF.put(0,2.0);
        prixBF.put(1,3.85);
    }

    public Map<String,Map<Integer,String>> getMenu() {
        return menu;
    }

    public Map<Integer, Double> getPrixRepas() {
        return prixRepas;
    }

    public Map<Integer, Double> getPrixBF() {
        return prixBF;
    }

    public Map<Integer, Double> getPrixBFA() {
        return prixBFA;
    }

    public Map<Integer, Double> getPrixBC() {
        return prixBC;
    }
}
