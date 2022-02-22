package tp0.Ex1.V2;

public class ServiceTableInt extends Service {

    public ServiceTableInt(){
        super(2);
    }
    public double getPrix(){
        return  super.getPrix()+13;
    }

    public String getNomService(){
        return super.getNomService()+"comptoir";
    }

}
