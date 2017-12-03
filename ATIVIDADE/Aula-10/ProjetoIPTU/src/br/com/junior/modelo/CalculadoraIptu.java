package br.com.junior.modelo;

public interface CalculadoraIptu {
    
    public static double getValorIptu(double valorImovel){
        return valorImovel * 0.02;
        
    }
}
