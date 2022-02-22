package tp0.Ex1.V1;

public class BoissonChaude {
    private int idBC;

    private Menu m = new Menu();

    public BoissonChaude(int idBC){
        this.idBC = idBC;
    }
    
    public String nom(){       
        return   m.getMenu().get("boissonChaude").get(idBC);
    }
    public double prix() {
        m.prixBoissonChaude();
        return m.getPrixBC().get(idBC);
    }
}

