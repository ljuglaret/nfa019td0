package tp0.Ex1.V2;

public class Repas {

    private int idRepas;

    private Menu m = new Menu();

    public Repas(int idRepas){
        this.idRepas = idRepas;
    }
    
    public String nom(){ 
        return  m.getMenu().get("repas").get(idRepas);
    }
    public double prix() throws Exception{
        m.prixRepas();
        return  m.getPrixRepas().get(idRepas);
    }
}
