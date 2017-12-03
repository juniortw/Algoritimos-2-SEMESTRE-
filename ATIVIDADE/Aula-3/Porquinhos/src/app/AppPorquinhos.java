
package app;

import modelo.GrupoPorquinhos;
import modelo.PorquinhoPapai;
import modelo.PorquinhoPersonalizado;
import modelo.PorquinhoVoVo;


public class AppPorquinhos {
    
    public static void main(String[] args) {
        
        PorquinhoVoVo porquinho1 = new PorquinhoVoVo(); 
        PorquinhoVoVo porquinho2 = new PorquinhoVoVo(); 
        PorquinhoVoVo porquinho3 = new PorquinhoVoVo(); 
    
        PorquinhoPapai porquinho4 = new PorquinhoPapai();
        System.out.println("Valor no porquinho4: "+porquinho4.getValor());
        System.out.println("Dono do porquinho é: "+porquinho4.getDono());
        
        porquinho4.setValor(44);
        porquinho4.setDono("Abestado");
        
        System.out.println("Valor no porquinho4: "+porquinho4.getValor());
        System.out.println("Dono do porquinho é: "+porquinho4.getDono());
        
        PorquinhoPersonalizado porquinho5 = new PorquinhoPersonalizado(5, "A");
        PorquinhoPersonalizado porquinho6 = new PorquinhoPersonalizado(6, "B");
        PorquinhoPersonalizado porquinho7 = new PorquinhoPersonalizado(7, "C");
        
        
        GrupoPorquinhos grupoPorquinhos1 = new GrupoPorquinhos();
        grupoPorquinhos1.setPorquinho1(porquinho5);
        grupoPorquinhos1.setPorquinho2(porquinho6);
        
        // E se eu quiser obter a soma de 2 porquinhos de grupoPorquinhos? 
        
          System.out.println("soma: "+grupoPorquinhos1.getSomaPorquinhos());
                
            
    
    }
    
    
}
