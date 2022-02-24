package tp0.Ex1.V3;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class BoissonFroide extends Article{
    private int idBF;
    private String nom;
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();

    public BoissonFroide(int idBF){
        this.idBF = idBF;
    }
  
    @Override
    public double calculPrix() {
        Object obj = null;
        try{
            InputStream inputStream = classloader.getResourceAsStream("Carte.json");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            obj = new JSONParser().parse(new BufferedReader(streamReader)); 
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


