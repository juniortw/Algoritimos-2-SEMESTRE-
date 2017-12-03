
package br.com.junior.app;

import br.com.junior.modelo.Atacante;
import br.com.junior.modelo.JogadorFuteol;
import br.com.junior.modelo.Lateral;
import br.com.junior.modelo.Meia;
import br.com.junior.modelo.Zagueiro;


public class AppFutebol {
    
    public static void main(String[] args) {
        
        JogadorFuteol Jo = new Zagueiro();
        Jo.chutar();
        Jo.aquecer();
        
        Zagueiro Jo2 = new Zagueiro();
        Jo2.chutar();
        Jo2.aquecer();
        
        JogadorFuteol lateral = new Lateral();
        JogadorFuteol meia = new Meia();
        JogadorFuteol atacante = new Atacante();
        
        lateral.chutar();
        lateral.aquecer();
        meia.chutar();
        meia.aquecer();
        atacante.chutar();
        atacante.aquecer();
                
        
        
    }
    
}
