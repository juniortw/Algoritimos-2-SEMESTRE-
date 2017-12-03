package br.com.junior.app;

import br.com.junior.modelo.Humano;
import br.com.junior.modelo.HumanoUtils;

public class AppHumanos {
    
    public static void main(String[] args) {
        
        Humano h1 = new Humano(20);
        Humano h2 = new Humano(60);
        Humano h3 = new Humano(100);
        
        System.out.println("h1 vai morrer daqui a "+h1.getAnosMaximoVida());
        System.out.println("h2 vai morrer daqui a "+h2.getAnosMaximoVida());
        System.out.println("h3 vai morrer daqui a "+h3.getAnosMaximoVida());
        
        System.out.println("Um homano vive no máxcimo: "+Humano.IDADE_MAXIMA_RACA_HUMANA);
        
        System.out.println("Frase de morte do h1: "+HumanoUtils.getFrasesMorte(h1));
        
        Humano caraLoko = HumanoUtils.getHumanoAleatorio();
        System.out.println("Tempo de vida do loko: "+caraLoko.getAnosMaximoVida());
        
        
        
        
                
    }
    
}
