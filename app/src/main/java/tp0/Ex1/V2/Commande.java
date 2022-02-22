package tp0.Ex1.V2;


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
        somme+=service.getPrix();
        
      
    }

    public void ajoutR(Repas repas) throws Exception{
        somme += repas.prix();
        recap.add(repas.nom() + " : " + repas.prix());
    } 

    public void ajoutB(Boisson b){
        if (b instanceof BoissonFroide){
            BoissonFroide bf = (BoissonFroide)b;
            somme += bf.getPrix();
            recap.add(bf.getNom()+ " : " + bf.getPrix());
        }
        else{
            if (b instanceof BoissonFroideA){
                BoissonFroideA bfa = (BoissonFroideA)b;
                somme += bfa.getPrix();
                recap.add(bfa.getNom()+ " : " + bfa.getPrix());
            }
            else{
                BoissonChaude bc = (BoissonChaude)b;
                somme += bc.getPrix();
                recap.add(bc.getNom()+ " : " + bc.getPrix());
            }
        }
    } 

    public void recap(){
        System.out.println("commande pour la table "+ cl.getNumeroClient()+ " en "+service.getNomService() + " servie par : " +serveur.getPrenomServeur());
        for (String str : recap){
            System.out.println(str);
        }
    }
   
    public double addition(){
        System.out.println("-------------------");
        
        return somme;
    }

   
}