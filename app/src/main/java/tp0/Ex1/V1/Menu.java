package tp0.Ex1.V1;

import java.util.*;

import java.nio.charset.StandardCharsets;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Menu {
    
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream inputStream = null;


    private Map<String,Map<Integer,String>> menu = new HashMap<>();

    private Map<Integer,Double> prixRepas = new HashMap<>();
    private Map<Integer,Double> prixBF = new HashMap<>();
    private Map<Integer,Double> prixBFA = new HashMap<>();
    private Map<Integer,Double> prixBC = new HashMap<>();

    public void prixRepas() throws Exception{
        Map<Integer,String> repas = new HashMap<>();
        inputStream = classloader.getResourceAsStream("Carte.json");
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        Object obj = new JSONParser().parse(reader);     
        JSONObject jo = (JSONObject) obj;
        
        JSONArray ja = (JSONArray) jo.get("platChaud");
        for (int i = 0; i < ja.size(); i++) {
            JSONObject plat = (JSONObject) ja.get(i);
            String nom = (String) plat.get("nom");
            double prix = (double)plat.get("prix");  
            repas.put(i,nom);
            menu.put("repas", repas);
            prixRepas.put(i,prix);
        }
    }

    public void prixBoissonChaude(){

        Object obj = null;
        try{
            inputStream = classloader.getResourceAsStream("Carte.json");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            obj = new JSONParser().parse(new BufferedReader(streamReader));     
        }
        catch(Exception e){
            System.out.println(e);
        }        JSONObject jo = (JSONObject) obj;
        
        Map<Integer,String> boissonChaude = new HashMap<>();

        JSONArray ja = (JSONArray) jo.get("boissonChaude");
        for (int i = 0; i < ja.size(); i++) {
            JSONObject bc = (JSONObject) ja.get(i);
            boissonChaude.put(i,(String) bc.get("nom"));
            menu.put("boissonChaude", boissonChaude);
            prixBC.put(i,(double)bc.get("prix"));
        }
    }


    public void prixBoissonFroide(){
        Object obj = null;
        try{
            inputStream = classloader.getResourceAsStream("Carte.json");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            obj = new JSONParser().parse(new BufferedReader(streamReader));    
        }
        catch(Exception e){
            System.out.println(e);
        }
        JSONObject jo = (JSONObject) obj;

        Map<Integer,String> boissonFroide = new HashMap<>();

        JSONArray ja = (JSONArray) jo.get("boissonFroide");
        for (int i = 0; i < ja.size(); i++) {
            JSONObject bc = (JSONObject) ja.get(i);
            boissonFroide.put(i,(String) bc.get("nom"));
            menu.put("boissonFroide", boissonFroide);
            prixBF.put(i,(double)bc.get("prix"));
        }
    }

   

    public void prixBoissonFroideA(){
        Object obj = null;
        try{
            inputStream = classloader.getResourceAsStream("Carte.json");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            obj = new JSONParser().parse(new BufferedReader(streamReader));
        }
        catch(Exception e){
            System.out.println(e);
        }
        JSONObject jo = (JSONObject) obj;

        Map<Integer,String> boissonFroideA = new HashMap<>();

        JSONArray ja = (JSONArray) jo.get("boissonFroideA");
        for (int i = 0; i < ja.size(); i++) {
            JSONObject bc = (JSONObject) ja.get(i);
            boissonFroideA.put(i,(String) bc.get("nom"));
            menu.put("boissonFroideA", boissonFroideA);
            prixBFA.put(i,(double)bc.get("prix"));
        }
    }

   

    public Map<String,Map<Integer,String>> getMenu() {return menu;}

    public Map<Integer, Double> getPrixRepas() {return prixRepas;}

    public Map<Integer, Double> getPrixBF() {return prixBF;}

    public Map<Integer, Double> getPrixBFA() {return prixBFA;}

    public Map<Integer, Double> getPrixBC() {return prixBC;}
}
