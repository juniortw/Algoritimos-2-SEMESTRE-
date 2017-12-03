package br.com.junior.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AppFormularioDinamico {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        // o "HashMap" ordena seus elementos 
        // a partir do Hash da chave
        
        // Para que o mapa armazene na mesma ordem de cadastro 
        // deve-se usar a implementação LinkedHashMap
        Map<String, Object> formulario = new LinkedHashMap<>();
        
        while (true) {            
            System.out.println("Campo");
            String campo = leitor.next();
            
            System.out.println("Valor");
            String valor = leitor.next();
            
            formulario.put(campo, valor);
            
            System.out.println("Digite 1 para mais campos");
            int resp = leitor.nextInt(); 
            
            if(resp != 1){
                break; // O break sai do "while"(ou "for")
            }
        }
        System.out.println("Formulário: "+formulario);
    }
    
}
