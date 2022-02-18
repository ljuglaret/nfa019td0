package tp0.V1;

import java.util.Map;

public class BoissonFroide {
    private int idBF;

    private Menu m = new Menu();

    public BoissonFroide(int idBF){
        this.idBF = idBF;
    }
    
    public String nom(){
        m.creer();

        Map<String,Map<Integer,String>> menu = m.getMenu();
       
        return  menu.get("boissonFroide").get(idBF);
    }
    public double prix(){
        m.creer();

        m.prixBoissonFroide();
        Map<Integer,Double>prix = m.getPrixBF();
        return prix.get(idBF);
    }
}

