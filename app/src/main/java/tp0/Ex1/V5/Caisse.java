package tp0.Ex1.V5;

import java.util.*;

public class Caisse {

    private Map<Integer,Commande> lc;
    
    public Caisse (){
        lc = new HashMap<>();
    }   

    public void ajoutCommande(Commande commande){
        lc.put(commande.getId(),commande);
    }

    public double aRendre(int idCommande ){
        Commande commande = lc.get(idCommande);
        return  commande.getCl().paiement() - commande.addition();
    }
}
