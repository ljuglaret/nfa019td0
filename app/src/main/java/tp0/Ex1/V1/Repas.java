package tp0.Ex1.V1;


import java.util.*;

public class Repas {

    private int idRepas;

    private Menu m = new Menu();

    public Repas(int idRepas){
        this.idRepas = idRepas;
    }
    
    public String nom(){
        m.creer();

        Map<String,Map<Integer,String>> menu = m.getMenu();
       
        return  menu.get("repas").get(idRepas);
    }
    public double prix(){
        m.creer();

        m.prixRepas();
        Map<Integer,Double>prix = m.getPrixRepas();
        return prix.get(idRepas);
    }
}
