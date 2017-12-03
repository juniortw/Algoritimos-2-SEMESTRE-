package br.com.junior.app;

import java.util.HashMap;
import java.util.Map;

public class AppFormularios {
    
    public static void main(String[] args) {
        //Criando um mapa
        // Map<Tipo da cahve, Tipo do valor>
        Map<String, Double> formulario1 = new HashMap<>();
        //Esse mapa aceita String como chave e Double como valor 
        
        // Inserindo elementos num mapa
        formulario1.put("peso", 70.0);
        formulario1.put("altura", 1.72);
        formulario1.put("salario", 1000.0);
        
        System.out.println("Formulario1 "+formulario1);
        
        //Recuperando elementos de um mapa 
        double alturaX = formulario1.get("altura");
        double pesoY = formulario1.get("peso");
        
        //E se pedir uma chave que não existe?
        // Ocorre um erro
        //double investimentos = formulario1.get("investimentos");
        //System.out.println("Investimentos? "+investimentos);
        
        System.out.println("peso "+pesoY);
        
        // E se fizemos um "put" com uma chave que já existe?
        formulario1.put("peso", 80.0);
        pesoY = formulario1.get("peso");
        System.out.println("peso: "+pesoY);
        
        // Recuperando q quantidade de elementos num mapa 
        System.out.println("Quantos? "+formulario1.size());
        
        // Excluindo o elemento de um mapa
        formulario1.remove("peso");
        System.out.println("formulario1: "+formulario1);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
