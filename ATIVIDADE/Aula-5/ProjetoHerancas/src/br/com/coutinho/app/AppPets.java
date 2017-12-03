
package br.com.coutinho.app;

import br.com.coutinho.modelo.Animal;
import br.com.coutinho.modelo.Cachorro;
import br.com.coutinho.modelo.Gato;
import java.util.Scanner;

public class AppPets {
    
    public static void main(String[] args) {
        // O objeto pet podera ser instanciado como 
        // Cachorro ou Gato 
        // Isso é um dos tipos de POLIMORFISMO(pode ter diferentes formas)
        Animal pet = null;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual pet vc vai criar? 1- Cão; 2- Gato");
        String tipo = leitor.next();
        
        switch (tipo){
            case "1":
                pet = new Cachorro();
                break;                
            case "2":
                pet = new Gato();
                break;
        }
        
        if (pet == null){
            System.out.println("Nenhum pet");
            System.exit(0);
        }
        
        pet.comer("Ração Hills");
        System.out.println(pet.emitirSom());
    }
    
}
