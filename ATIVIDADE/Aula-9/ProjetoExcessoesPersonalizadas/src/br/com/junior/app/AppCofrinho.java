package br.com.junior.app;

import br.com.junior.excecoes.DepositoInvalidoException;
import br.com.junior.excecoes.ValorInicialInvalidoException;
import br.com.junior.modelo.Cofrinho;

public class AppCofrinho {
    
    public static void main(String[] args) {
        
        try{
        Cofrinho cofrinhoDoBem = new Cofrinho(100);
        cofrinhoDoBem.depositar(5);
        cofrinhoDoBem.quebrar();
        cofrinhoDoBem.depositar(5);
        } catch(ValorInicialInvalidoException viex){
            System.out.println("Erro ao criar o cofre: "+viex.getMessage());
            
        } catch(DepositoInvalidoException diex){
            System.out.println("Erro ao depositar: "+diex.getMessage());
            
        }
    }
    
}
