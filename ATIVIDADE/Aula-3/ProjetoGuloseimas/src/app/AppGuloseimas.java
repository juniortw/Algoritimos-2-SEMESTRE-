
package app;

import modelo.Biscoito;
import modelo.Lanche;


public class AppGuloseimas {
    
    public static void main(String[] args) {
        
        Biscoito biscoito1 = new Biscoito(4.5); 
        
        Biscoito biscoito2 = new Biscoito("Morango", 23, 49, 90);
        
        System.out.println("Biscoito 1 peso: "+biscoito1.getPeso());
        System.out.println("Biscoito 2 Calorias: "+biscoito2.getCaloriasPorUnidade());
        System.out.println("Biscoito 2 Sabor: "+biscoito2.getSabor());
        
        Lanche lanche1 = new Lanche(biscoito1); 
        Lanche lanche2 = new Lanche("Biscoito da tarde", biscoito2);
        
        System.out.println("Tipo de lanche: "+lanche1.getTipo());
        
    }
    
}
