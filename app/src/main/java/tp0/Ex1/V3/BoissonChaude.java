package tp0.Ex1.V3;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class BoissonChaude extends Article{
    private int idBC;
    private String nom;
        
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();

    public BoissonChaude(int idBC){
        this.idBC = idBC;
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


