package tp0.Ex1.V2;

public class ServiceComptoir extends Service {

    public ServiceComptoir(){
        super(0);
    }

    public double getPrix(){
        return  super.getPrix()+11;
    }

    public String getNomService(){
        return super.getNomService()+" comptoir";
    }
   
}
