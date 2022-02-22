package tp0.Ex1.V2;

public class BoissonChaude extends Boisson {
    Menu m = new Menu();
    private int idBC;

    public BoissonChaude(int idBC){
        super(idBC);
    }

    public double getPrix(){
        m.prixBoissonChaude();
       return m.getPrixBC().get(idBC);
    }
    public String getNom() {
        return m.getMenu().get("boissonChaude").get(idBC);
    }
}

