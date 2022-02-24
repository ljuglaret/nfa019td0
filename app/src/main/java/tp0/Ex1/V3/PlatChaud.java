package tp0.Ex1.V3;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class PlatChaud extends Article{
    private int idPC;
    private String nom;

    ClassLoader classloader = Thread.currentThread().getContextClassLoader();

    public PlatChaud(int idPC){
        this.idPC = idPC;
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


