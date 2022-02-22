package tp0.Ex1.V3;

import java.io.FileReader;

  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class BoissonFroideA extends Article{
    private int idBFA;
    private String nom;
    public BoissonFroideA(int idBFA){
        this.idBFA = idBFA;
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
        JSONArray ja = (JSONArray) jo.get("boissonFroideA");
        JSONObject BFA = (JSONObject) ja.get(idBFA);
        nom = (String)BFA.get("nom");
        return (double)BFA.get("prix");     
    }

    @Override
    public String getNom() {
        return nom;
    }
}


