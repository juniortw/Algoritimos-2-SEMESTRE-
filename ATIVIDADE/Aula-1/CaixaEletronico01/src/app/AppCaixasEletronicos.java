
package app;

import modelo.CaixaEletronico;


public class AppCaixasEletronicos {
    
    public static void main(String[] args) {
        // Instanciando(criando) um objetodo tipo CaixaEletronico
        CaixaEletronico caixaA = new CaixaEletronico();
        CaixaEletronico caixaB = new CaixaEletronico();
        
        caixaA.depositar(100);
        caixaB.depositar(800);
        
        caixaA.sacar(50);
        caixaB.sacar(400);
        
        System.out.println("Quais os bancos do A? "+ caixaA.bancosDisponiveis());
        
        System.out.println("Quais os bancos do B? "+ caixaB.bancosDisponiveis());
        
        caixaA.configurarBancos("Banco Itaú");
        caixaB.configurarBancos("Banco Caixa");
        
        System.out.println("Quais os bancos A? "+ caixaA.bancosDisponiveis());
        
        System.out.println("Quais os bancos B? "+ caixaB.bancosDisponiveis());
        
        
        
             
        
    }
}
