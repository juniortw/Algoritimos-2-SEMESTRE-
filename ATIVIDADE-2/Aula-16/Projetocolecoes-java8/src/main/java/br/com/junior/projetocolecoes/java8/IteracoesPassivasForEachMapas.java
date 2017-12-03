package br.com.junior.projetocolecoes.java8;

import java.util.HashMap;
import java.util.Map;

public class IteracoesPassivasForEachMapas {
    
    public static void main(String[] args) {
        Map<String, Double> alturas = new HashMap<>();
        alturas.put("Zé Ruela", 1.75);
        alturas.put("Zé Buduia", 1.63);
        alturas.put("Zé Du Alho", 1.50);
        
        alturas.forEach((nome, altura) -> {
            System.out.println("Pessoa: "+nome+" - altura: "+altura);
        });
    }
    
}
