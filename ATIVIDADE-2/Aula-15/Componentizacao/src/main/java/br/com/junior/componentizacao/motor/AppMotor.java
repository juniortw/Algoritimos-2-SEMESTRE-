package br.com.junior.componentizacao.motor;

import br.com.junior.componentizacao.Motor;

public class AppMotor {
    
    public static void main(String[] args) {
        
        Motor motor = new Motor();
        
        motor.produzirFaiscaIgnicao();
        motor.bombearCombustivel(-1);
        System.out.println("Energia gerada: "+motor.converterEnergia(3000));
                
        
    }
    
}
