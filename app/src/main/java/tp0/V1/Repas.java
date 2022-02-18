package tp0.V1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
