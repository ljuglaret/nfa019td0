package tp0.Ex1.V2;

public class BoissonFroideA extends Boisson{
    private int idBFA;
    Menu m = new Menu();

    public BoissonFroideA(int idBFA){
        super(idBFA);
        this.idBFA = idBFA;
    }

    public double getPrix(){
        m.prixBoissonFroideA();
       return m.getPrixBFA().get(idBFA);
    }

    public String getNom() {
        return m.getMenu().get("boissonFroideA").get(idBFA);
    }
}

