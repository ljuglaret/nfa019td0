package tp0.Ex1.V2;


public class MainV2 {
    public static void exemple() throws Exception{
        Client cl = new Client(1);
        Repas repas = new Repas(0);
        Serveur serveur = new Serveur(1234,"toto");
        Service comptoire = new ServiceComptoir();
        Boisson bfa = new BoissonFroideA(0);
        Boisson bf = new BoissonFroide(1);
        Boisson bc = new BoissonChaude(0);
        Commande com = new Commande(serveur,cl,comptoire);
        com.ajoutR(repas);
        com.ajoutB(bfa);
        com.ajoutB(bc);
        com.ajoutB(bf);
        com.recap();
        System.out.println("Total : "+ com.addition() + " euros");
    }
}
