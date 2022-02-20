package tp0.Ex1.V1;

import java.util.Map;

public class BoissonFroideA {
    private int idBFA;

    private Menu m = new Menu();

    public BoissonFroideA(int idBFA){
        this.idBFA = idBFA;
    }
    
    public String nom(){
        m.creer();

        Map<String,Map<Integer,String>> menu = m.getMenu();
       
        return  menu.get("boissonFroideA").get(idBFA);
    }
    public double prix(){
        m.creer();

        m.prixBoissonFroideA();
        Map<Integer,Double>prix = m.getPrixBFA();
        return prix.get(idBFA);
    }
}

