package tp0.Ex1.V3;


import java.util.*;

class Commande{
    private Client cl;
    private Serveur serveur;
    private double somme = 0 ;
    private List<String> recap = new ArrayList<>();

    public Commande(Serveur serveur,Client cl){
        this.cl = cl;
        this.serveur = serveur;
    }

    public void ajoutArticle(Article article) throws Exception{
        somme += article.calculPrix();
        recap.add(article.getNom() + " : " + article.calculPrix());
    } 


    public void recap(){
        System.out.println("commande pour la table "+ cl.getNumeroClient()+ " servie par : " +serveur.getPrenomServeur());
        for (String str : recap){
            System.out.println(str);
        }
    }
   
    public double addition(){
        System.out.println("-------------------");
        
        return somme;
    }

   
}