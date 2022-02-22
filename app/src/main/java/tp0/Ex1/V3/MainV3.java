package tp0.Ex1.V3;


public class MainV3 {
    public static void exemple() throws Exception{
        Client cl = new Client(1);
        Serveur serveur = new Serveur(1234,"toto");
        Article comptoir = new ServiceComptoir();
        Article repas = new PlatChaud(0);
        Article bfa = new BoissonFroideA(0);
        Article bf = new BoissonFroide(1);
        Article bc = new BoissonChaude(0);
        Commande com = new Commande(serveur,cl);
        com.ajoutArticle(repas);
        com.ajoutArticle(bfa);
        com.ajoutArticle(bc);
        com.ajoutArticle(bf);
        com.ajoutArticle(comptoir);
        com.recap();
        System.out.println("Total : "+ com.addition() + " euros");
    }
}
