package tp0.Ex1.V5;


import java.util.*;


class Commande{
    private Client cl;
    private Serveur serveur;
    private int id;
    private List<Article> recap = new ArrayList<>();
    private double add = 0 ;

    public Commande(Serveur serveur,Client cl, int id){
        this.cl = cl;
        this.serveur = serveur;
        this.add = 0 ;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void ajoutArticle(Article article) throws Exception{
       recap.add(article); 
    } 


    public void recap(){
        System.out.println("commande pour la table "+ cl.getNumeroClient()+ " servie par : " +serveur.getPrenomServeur());
        for (Article str : recap){
            if (str.getNom().equals("service")){
                if (str.getId() == 0) {
                    this.add = this.add+11;
                }
                else if (str.getId() == 1) {
                    this.add = this.add+12;
                }
                else {
                    this.add = this.add+13;
                }
            }
            else{
                double x = str.prixArticle();
                System.out.println(str.getNom()+ " :  " + x);
                this.add= this.add + x;
            }
        }
    }

    public double addition(){
        return this.add;
    }

    public Client getCl() {
        return cl;
    }

   
}