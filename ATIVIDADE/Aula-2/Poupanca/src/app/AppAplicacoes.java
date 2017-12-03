
package app;

import modelo.Poupanca;


public class AppAplicacoes {
    
    public static void main(String[] args) {
        Poupanca poupanca1 = new Poupanca();
        poupanca1.aplicar(46);
        poupanca1.sacar(6);
        
        poupanca1.atualizarTitular("Junior");
        
        System.out.println("Saldo atual: "+poupanca1.saldo());
        System.out.println("Titular atual: "+poupanca1.titular());
    }
    
}
