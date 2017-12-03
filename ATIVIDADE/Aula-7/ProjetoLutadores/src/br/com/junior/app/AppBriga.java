
package br.com.junior.app;

import br.com.junior.modelo.Lutador;
import br.com.junior.modelo.LutadorForte;
import br.com.junior.modelo.LutadorFraco;


public class AppBriga {
    
    public static void main(String[] args) {
        
        Lutador lutador1 = new LutadorForte(100, 10); 
        Lutador lutador2 = new LutadorFraco(100, 2);
        
        System.out.println("Vida do forte: "+lutador1.getVida());
        System.out.println("Vida do fraco: "+lutador2.getVida());
        
        lutador1.receberGolpe(lutador2.aplicarGolpe());
        lutador1.receberGolpe(lutador2.aplicarGolpe());
        lutador1.receberGolpe(lutador2.aplicarGolpe());
        lutador1.receberGolpe(lutador2.aplicarGolpe());
        System.out.println("A vida do lutador 1 é: "+lutador1.getVida());
        
        
        lutador2.receberGolpe(lutador1.aplicarGolpe());
        System.out.println("A vida do lutador 2 é: "+lutador2.getVida());
        
        
        
    }
    
}
