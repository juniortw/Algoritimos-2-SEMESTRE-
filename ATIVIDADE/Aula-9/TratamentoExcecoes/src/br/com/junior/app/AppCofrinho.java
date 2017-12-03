package br.com.junior.app;

import br.com.junior.modelo.Cofrinho;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppCofrinho {
    public static void main(String[] args) {
        Cofrinho cofreLoko = null;
        
        try {
            cofreLoko = new Cofrinho(-100);
        } catch (Exception ex) {
            System.out.println("Seu cofre esta negatico "+ex.getMessage());
        }
        
        // caso o cofrinho não tenha sido criado
        if(cofreLoko == null){
            System.exit(0);
        }
               
        try {
            cofreLoko.depositar(5);
            cofreLoko.quebrar();
            cofreLoko.depositar(5);
            
        } catch (Exception ex) {
            // O programa só entra nesse bloco se 
            // a Exception do "depositar()" for lançada
            System.out.println("Erro ao depositar! "+ex.getMessage());
        }
        
        
    }
    
}
