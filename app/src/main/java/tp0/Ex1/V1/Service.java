package tp0.Ex1.V1;

public class Service {
    
    private ServiceComptoir sc = new ServiceComptoir();//0
    private ServiceTableExt ste = new ServiceTableExt();//1
    private ServiceTableInt sti = new ServiceTableInt();//2
    
    private double prix;
    private String nom;

    public Service(int idService){
        if (idService == 0 ){
            this.prix = 11.0;
            this.nom = sc.nom();
        }
        else if (idService == 1 ){
            prix = 12.0;
            this.nom =  ste.nom();
        }
        else{
            prix = 13.0;
            this.nom = sti.nom();
        }
    }

    public String nomService(){
        return nom;
    }
    
    public double getPrix() {
        return prix;
    }
}
