package tp0.Ex1.V3;

import java.io.FileReader;

  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class BoissonFroide extends Article{
    private int idBF;
    private String nom;
    public BoissonFroide(int idBF){
        this.idBF = idBF;
    }
  
    @Override
    public double calculPrix() {
        Object obj = null;
        try{
            obj = new JSONParser().parse(new FileReader("src/main/resources/Carte.json"));     
        }
        catch(Exception e){
            System.out.println(e);
        }        JSONObject jo = (JSONObject) obj;
        JSONArray ja = (JSONArray) jo.get("boissonFroide");
        JSONObject BF = (JSONObject) ja.get(idBF);
        nom = (String)BF.get("nom");
        return (double)BF.get("prix");     
    }

    @Override
    public String getNom() {
        return nom;
    }
}


