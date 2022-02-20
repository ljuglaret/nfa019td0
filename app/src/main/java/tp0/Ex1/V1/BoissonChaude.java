package tp0.Ex1.V1;

import java.util.Map;

public class BoissonChaude {
    private int idBF;

    private Menu m = new Menu();

    public BoissonChaude(int idBF){
        this.idBF = idBF;
    }
    
    public String nom(){
        m.creer();

        Map<String,Map<Integer,String>> menu = m.getMenu();
       
        return  menu.get("boissonChaude").get(idBF);
    }
    public double prix(){
        m.creer();

        m.prixBoissonChaude();
        Map<Integer,Double>prix = m.getPrixBF();
        return prix.get(idBF);
    }
}

