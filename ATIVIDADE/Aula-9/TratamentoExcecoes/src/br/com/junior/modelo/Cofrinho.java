
package br.com.junior.modelo;

public class Cofrinho {
    private double valor;
    private boolean quebrado = false;
    
    // Construtor com valor inicial no cofrinho 
    public Cofrinho(double valor) throws Exception{
        if(valor < 0){
            throw new Exception("Não pode iniciar negatico");
        }
        this.valor = valor;
    }
    
    // "throw Exception" indica que o método informa a quem
    // for usá-lo que pode lançar uma "Exception"
    public void depositar(double valorDepositado) throws Exception{
        
        if(this.quebrado){
            throw new Exception("O cofrinho está quebrado :");
        }
        
        if(valorDepositado < 0){
            // "throw..."  FINALIZA o método
            // dizemos que "lançamos uma exceção"
            throw new Exception("Não é possível depositar valor negativo!");
        }
        
        this.valor += valorDepositado;
    }
    
    public void quebrar(){
        this.quebrado = true;
    }
    
    public double getValor() {
        return valor;
    }

    
    
    
}
