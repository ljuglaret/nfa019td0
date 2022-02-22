package tp0.Ex1.V2;

public class ServiceTableExt extends Service{
    public ServiceTableExt(){
        super(1);
    }
    public double getPrix(){
        return  super.getPrix()+12;
    }

    public String getNomService(){
        return super.getNomService()+"comptoir";
    }
}
