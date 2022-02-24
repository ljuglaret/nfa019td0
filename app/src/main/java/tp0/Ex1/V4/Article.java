package tp0.Ex1.V4;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public  class Article implements Facturation {

        
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream inputStream = null;

    private int id;
    private String nom;
    public Article(String nom , int id){
        this.nom = nom;
        this.id = id;
    }
  
    public int getId() {
        return id;
    }

    public double prixArticle() {
        Object obj = null;
        try{
            inputStream = classloader.getResourceAsStream("Carte.json");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            obj = new JSONParser().parse(reader); 
        }
        catch(Exception e){
            System.out.println(e);
        }        JSONObject jo = (JSONObject) obj;
        JSONArray ja = (JSONArray) jo.get(nom);
        JSONObject PC = (JSONObject) ja.get(id);
        nom = (String)PC.get("nom");
        return (double)PC.get("prix");     
    }

    public  String getNom(){
        return nom;
    }

}
