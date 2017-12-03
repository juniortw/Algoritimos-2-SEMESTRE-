package br.com.junior.app;

import br.com.junior.enums.FaixaEtaria;
import br.com.junior.enums.RendaFamiliar;
import br.com.junior.modelo.Cliente;

public class AppClientes {
    
    public static void main(String[] args) {
        
        Cliente clienteA = new Cliente("Maggie", FaixaEtaria.INFANCIA);
        Cliente clienteB = new Cliente("Lisa", FaixaEtaria.ADOLESCENCIA);
        Cliente clienteC = new Cliente("Hommer", FaixaEtaria.ADULTO);
        Cliente clienteD = new Cliente("Burns", FaixaEtaria.IDOSO);
        
        System.out.println("Cliente A é: "+clienteA.getFaixaEtaria());
        System.out.println("Cliente B é: "+clienteB.getFaixaEtaria());
        System.out.println("Cliente C é: "+clienteC.getFaixaEtaria());
        System.out.println("Cliente D é: "+clienteD.getFaixaEtaria());
        
        clienteA.setRendaFamiliar(RendaFamiliar.CLASSE_B);
        System.out.println("A clienteA, é: "+clienteA.getRendaFamiliar().getDescricao());
        System.out.println("A cliente A ganha no mínimo: "+clienteA.getRendaFamiliar().getMinimo());
        System.out.println("A clienteA, é: "+clienteA.getRendaFamiliar().getMaximo());
        
    }
    
}
