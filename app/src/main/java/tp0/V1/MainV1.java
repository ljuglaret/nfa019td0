package tp0.V1;


public class MainV1 {
    public static void exemple(){
        Client cl = new Client(1);
        Repas repas = new Repas(0);
        BoissonFroide bf = new BoissonFroide(1);
        BoissonFroideA bfa = new BoissonFroideA(0);
        BoissonChaude bc = new BoissonChaude(0);
        Commande com = new Commande(cl,new Service(0));
        com.ajoutR(repas);
        com.ajoutBF(bf);
        com.ajoutBFA(bfa);
        com.ajoutBC(bc);
        com.recap();
        System.out.println("Total : "+ com.addition() + " euros");
    }
}
