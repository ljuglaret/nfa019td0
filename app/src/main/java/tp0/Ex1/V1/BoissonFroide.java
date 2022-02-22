package tp0.Ex1.V1;


public class BoissonFroide {
    private int idBF;

    private Menu m = new Menu();

    public BoissonFroide(int idBF){
        this.idBF = idBF;
    }
    
    public String nom(){
        return  m.getMenu().get("boissonFroide").get(idBF);
    }
    public double prix(){
        m.prixBoissonFroide();
        return m.getPrixBF().get(idBF);
    }
}

