
package br.com.junior.modelo;


public abstract class Investimento {
    
    private double valor; 
    
    public abstract double getTaxaRendimento();

    public void render(){
        this.valor *= 1+ (this.getTaxaRendimento()/100);
    } 

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
