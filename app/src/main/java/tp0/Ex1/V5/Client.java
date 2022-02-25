package tp0.Ex1.V5;

import java.util.Scanner;

public class Client{
    
    private int numeroClient;
    private double paiementClient = 0 ;

    public Client(int numeroClient){
        this.numeroClient = numeroClient;

    }

    public int getNumeroClient() {
        return numeroClient;
    }

   

    public double paiement()  {
        System.out.println("Saisie somme versee par le client : ");
        Scanner sc = new Scanner(System.in);
        this.paiementClient =  sc.nextDouble();
        return this.paiementClient;
 
    }
}