package tp0.Ex1.V1;


import java.util.*;

class Commande{
    private Client cl;
    private Service service;
    private Serveur serveur;
    private double somme = 0 ;
    private List<String> recap = new ArrayList<>();

    public Commande(Serveur serveur,Client cl,Service service){
        this.cl = cl;
        this.service = service;
        this.serveur = serveur;
    }

    public void ajoutR(Repas repas){
        somme += repas.prix();
        recap.add(repas.nom() + " : " + repas.prix());
    } 

    public void ajoutBF(BoissonFroide bf){
        somme += bf.prix();
        recap.add(bf.nom() + " : " + bf.prix());
    } 

    public void ajoutBFA(BoissonFroideA bfa){
        somme += bfa.prix();
        recap.add(bfa.nom() + " : " + bfa.prix());
    } 

    public void ajoutBC(BoissonChaude bc){
        somme += bc.prix();
        recap.add(bc.nom() + " : " + bc.prix());
    } 
   
    public void recap(){
        System.out.println("commande pour la table "+ cl.getNumeroClient()+ " en "+service.nomService() + " servie par : " +serveur.getPrenomServeur());
        for (String str : recap){
            System.out.println(str);
        }
    }
   
    public double addition(){
        System.out.println("-------------------");
        
        return somme;
    }

   
}