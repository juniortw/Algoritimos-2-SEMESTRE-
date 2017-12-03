package br.com.junior.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMapasListas {
    
    public static void main(String[] args) {
        
        List<Map<String, Object>> listaMapas = new ArrayList<>();
        
        Map<String, Object> mapa1 = new HashMap<>();
        mapa1.put("pais", "Brasil");
        mapa1.put("estado", "São Paulo");
        
        Map<String, Object> mapa2 = new HashMap<>();
        mapa2.put("peso", 90);
        mapa2.put("altura", 1.65);
        
        listaMapas.add(mapa1); 
        listaMapas.add(mapa2); 
        
        System.out.println(listaMapas);
        
        mapa2.remove("altura");
        System.out.println(listaMapas);
    }
    
}
