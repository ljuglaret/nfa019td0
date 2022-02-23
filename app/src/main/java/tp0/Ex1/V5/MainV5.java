package tp0.Ex1.V5;


public class MainV5 {
    public static void exemple() throws Exception{
        Client cl = new Client(1);
        Serveur serveur = new Serveur(1234,"toto");
        Commande commande0 = new Commande(serveur, cl);
        
        Article service = new Article("service",0);

        Article bf = new Article("boissonFroide",1);     
        Article bfa = new Article("boissonFroideA",0);      
        Article repas = new Article("platChaud",0);
        Article bc = new Article("boissonChaude",0);     
      
        commande0.ajoutArticle(service);
        commande0.ajoutArticle(repas);
        commande0.ajoutArticle(bf);
        commande0.ajoutArticle(bfa);
        commande0.ajoutArticle(bc);
        
       
        commande0.recap();
       System.out.println("Total : "+ commande0.addition() + " euros");
    }
}
