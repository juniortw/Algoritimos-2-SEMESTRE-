
package br.com.junior.app;

import br.com.junior.modelo.Lutador;
import br.com.junior.modelo.LutadorForte;
import br.com.junior.modelo.LutadorFraco;
import java.util.Scanner;

public class AppJogoBriga {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double vidaJogador1;
        double forcaJogador1; 
        double vidaJogador2;
        double forcaJogador2; 
        int quantGolpes = 0; 
        int quantGolpes2 = 0; 
        
        System.out.println("Qual o valor da vida do jogador 1?");
        vidaJogador1 = leitor.nextInt();
        
        System.out.println("Qual o valor da força do jogador 1?");
        forcaJogador1 = leitor.nextInt();
        
        System.out.println("Qual o valor da vida do jogador 2?");
        vidaJogador2 = leitor.nextInt();
        
        System.out.println("Qual o valor da força do jogador 2?");
        forcaJogador2 = leitor.nextInt();
        
        
        Lutador Lutador1 = new LutadorForte(vidaJogador1, forcaJogador1);
        Lutador Lutador2 = new LutadorFraco(vidaJogador2, forcaJogador2);
        
        
        while (Lutador1.isVivo() && Lutador2.isVivo()){
            
            
            System.out.println("Qual jogador vai golpear ? 1- Para primeiro jogador ou 2- para o segundo");
            int golpe = leitor.nextInt();
            switch (golpe){
                case 1:
                    Lutador1.receberGolpe(Lutador2.aplicarGolpe());
                    quantGolpes++;
                    break;
                case 2: 
                    Lutador2.receberGolpe(Lutador1.aplicarGolpe());
                    quantGolpes2++;
                    break;
             }
        }
            
            
            System.out.println("A vida do jogador 1 é : "+Lutador1.getVida());
            System.out.println("A vida do jogador 2 é : "+Lutador2.getVida());
            
            
            if (Lutador1.isMorto()){
                System.out.println("K.O! Lutador 2 venceu após aplicar "+quantGolpes2);
            } else {
                System.out.println("K.O! Lutador 1 venceu após aplicar "+quantGolpes);
            }
            
            
    }
    
}
