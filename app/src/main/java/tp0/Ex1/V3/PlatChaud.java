package tp0.Ex1.V3;

import java.io.FileReader;

  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class PlatChaud extends Article{
    private int idPC;
    private String nom;
    public PlatChaud(int idPC){
        this.idPC = idPC;
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
        JSONArray ja = (JSONArray) jo.get("platChaud");
        JSONObject PC = (JSONObject) ja.get(idPC);
        nom = (String)PC.get("nom");
        return (double)PC.get("prix");     
    }

    @Override
    public String getNom() {
        return nom;
    }
}


