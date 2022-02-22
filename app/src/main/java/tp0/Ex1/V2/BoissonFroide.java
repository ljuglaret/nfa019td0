package tp0.Ex1.V2;

public class BoissonFroide extends Boisson{
    private int idBF;
    Menu m = new Menu();

    public BoissonFroide(int idBF){
        super(idBF);
        this.idBF=idBF;
    }

    public double getPrix(){
        m.prixBoissonFroide();
       return m.getPrixBF().get(idBF);
    }
    public String getNom() {
        return m.getMenu().get("boissonFroide").get(idBF);
    }
  
}

