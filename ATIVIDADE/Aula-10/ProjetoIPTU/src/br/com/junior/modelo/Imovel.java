package br.com.junior.modelo;

public abstract class Imovel {
    
    private double valor;
    public abstract double getValorReal();
    public double TAXA_LUXO = 30;
    public double TAXA_SUPERLUXO = 40;
    public double TAXA_SEMPLES = 10;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
