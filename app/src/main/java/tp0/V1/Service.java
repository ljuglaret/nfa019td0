package tp0.V1;

public class Service {
    
    private ServiceComptoir sc = new ServiceComptoir();//0
    private ServiceTableExt ste = new ServiceTableExt();//1
    private ServiceTableInt sti = new ServiceTableInt();//2
    
    private int idService;

    public Service(int idService){
      this.idService = idService;
    }

    public String nomService(){
        if (idService == 0 ){
            return sc.nom();
        }
        else if (idService == 0 ){
            return ste.nom();
        }
        else{
            return sti.nom();
        }
    }
}
