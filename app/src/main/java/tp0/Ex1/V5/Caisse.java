package tp0.Ex1.V5;

import java.util.*;

public class Caisse {

    private Map<Integer,Commande> lc;
    
    public Caisse (){
        lc = new HashMap<>();
    }   

    public void ajoutCommande(int idCommande,Commande commande){
        lc.put(idCommande,commande);
    }

    //calcule reste à rendre pour une commande

    public double aRendre(int idCommande , double verseParLeClient){
        Commande commande = lc.get(idCommande);
        double totalAPayer = commande.addition() ;
        return verseParLeClient - totalAPayer;
    }
}
