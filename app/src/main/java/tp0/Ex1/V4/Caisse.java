package tp0.Ex1.V4;

import java.util.*;

public class Caisse {

    private Map<Integer,Commande> lc;
    
    public Caisse (){
        lc = new HashMap<>();
    }   

    public void ajoutCommande(int idCommande,Commande commande){
        lc.put(idCommande,commande);
    }
}
