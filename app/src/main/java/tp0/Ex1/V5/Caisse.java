package tp0.Ex1.V5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Caisse {

    private Map<Integer,Commande> lc;
    
    //0.01 0.02 0.05 0.1 0.20 0.50 1 2 5 10 20 50
    private List<Integer> piecesEtBilletsDispos = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1));
    private List<Double> valeurs = new ArrayList<>(Arrays.asList(0.01,0.02,0.05,0.10,0.20,0.5,1.0,2.0,5.0,10.0,20.0,50.0));

    public Caisse (){
        lc = new HashMap<>();
    }  
    
    public  boolean peutRendreLaMonnaie(double aRendre){
        List<Double> sommesDisponibles = new ArrayList<>();
        double delta = Math.pow(10, -16);
        for (int i = 0 ; i < piecesEtBilletsDispos.size() - 1 ; i++){
            double v0 = valeurs.get(i)* piecesEtBilletsDispos.get(i);
            sommesDisponibles.add(v0);
            //La comparaison sur les double nécessite de prendre en compte l'erreur d'arrondi
            // ici fixée à 10^-16
            if (Math.abs(aRendre - v0) < delta){
                return true;
            }

            for(int j = i+1;j<piecesEtBilletsDispos.size();j++){
                v0 = v0 + valeurs.get(j)*piecesEtBilletsDispos.get(j);
                sommesDisponibles.add(v0);
                if (Math.abs(aRendre - v0) < delta){
                    return true;
                }
            }
        }
        return false;
    }

    public void ajoutCommande(Commande commande){
        lc.put(commande.getId(),commande);
    }

    public double aRendre(int idCommande ) throws Exception{
        
        Commande commande = lc.get(idCommande);
        double paiementCl =  commande.getCl().paiement(); 
        double rendu = paiementCl - commande.addition();
       
        System.out.println(rendu);
        if (rendu < 0){
            throw new Exception("Le montant est insuffisant, il manque " + 
                (commande.addition() - paiementCl));
        }
        if(!peutRendreLaMonnaie(rendu)){
            throw new Exception("la caisse ne permet pas de rendre la monnaie ");
        }
        return  rendu;
    }
}
