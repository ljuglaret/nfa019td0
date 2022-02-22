package tp0.Ex1.V1;

public class Service {
    
    private ServiceComptoir sc = new ServiceComptoir();//0
    private ServiceTableExt ste = new ServiceTableExt();//1
    private ServiceTableInt sti = new ServiceTableInt();//2
    
    private int idService;
    private double prix;

    public Service(int idService){
      this.idService = idService;
    }

    public String nomService(){
        if (idService == 0 ){
            prix = 11.0;
            return sc.nom();
        }
        else if (idService == 1 ){
            prix = 12.0;
            return ste.nom();
        }
        else{
            prix = 13.0;
            return sti.nom();
        }
    }
    
    public double getPrix() {
        return prix;
    }
}
