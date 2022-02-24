package tp0.Ex1.V5;

class Serveur{
    private int idServeur;
    private String prenomServeur;

    public Serveur(int idServeur , String prenomServeur){
        this.idServeur = idServeur;
        this.prenomServeur = prenomServeur;
    }

    public int getIdServeur() {
        return idServeur;
    }
    
    public String getPrenomServeur() {
        return prenomServeur;
    }

    //nombre D emplacements dont il s'occupe
}