
package br.com.junior.modelo;

import br.com.junior.excecoes.DepositoInvalidoException;
import br.com.junior.excecoes.ValorInicialInvalidoException;
import javax.xml.bind.ValidationException;

public class Cofrinho {
    private double valor;
    private boolean quebrado = false;
    
    // Construtor com valor inicial no cofrinho 
    public Cofrinho(double valor) throws ValorInicialInvalidoException{
        if(valor < 0){
            throw new ValorInicialInvalidoException();
        }
        this.valor = valor;
    }
    
    // "throw Exception" indica que o método informa a quem
    // for usá-lo que pode lançar uma "Exception"
    public void depositar(double valorDepositado) throws DepositoInvalidoException{
        
        if(this.quebrado){
            throw new DepositoInvalidoException("Cofre quebrabo");
        }
        
        if(valorDepositado < 0){
            // "throw..."  FINALIZA o método
            // dizemos que "lançamos uma exceção"
            throw new DepositoInvalidoException("Valor não pode ser menor que ZERO");
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
