package br.com.junior.app;

import br.com.junior.modelo.Boletim;
import br.com.junior.modelo.BoletimBonzinho;
import br.com.junior.modelo.BoletimMalvado;

public class AppBoletim {
    
    public static void main(String[] args) {
        
        Boletim meuBoletim = new BoletimBonzinho(7,9);
        Boletim meuOutroBoletim = new BoletimMalvado(7,8);
        
        //Assim como classes abstratas, interfaces
        //não podem ser instanciadas
        //Boletim boletimTosco = new Boletim();
        
        if (meuBoletim.isAprovado()){
            System.out.println("O 'meuBoletim' foi APROVADO! ");
        } else {
            System.out.println("O 'meuOutroBoletim' deu RUIM! ");
        }
        
        if (meuOutroBoletim.isAprovado()){
            System.out.println("O 'meuBoletim' foi APROVADO! ");
        } else {
            System.out.println("O 'meuOutroBoletim' deu RUIM! ");
        }
        
        
    }
    
}
