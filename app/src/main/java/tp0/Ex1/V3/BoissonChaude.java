package tp0.Ex1.V3;

import java.io.FileReader;

  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class BoissonChaude extends Article{
    private int idBC;
    private String nom;
    public BoissonChaude(int idBC){
        this.idBC = idBC;
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
        JSONArray ja = (JSONArray) jo.get("boissonChaude");
        JSONObject bc = (JSONObject) ja.get(idBC);
        nom = (String)bc.get("nom");
        return (double)bc.get("prix");     
    }

    @Override
    public String getNom() {
        return nom;
    }
}


