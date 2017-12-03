
package modelo;


public class Poupanca {
    
    private double saldo;
    private double taxa;
    private String titular;
    
    public void aplicar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if (this.saldo >= valor){
        this.saldo -= valor;        
      }
    }
    
    public double saldo(){
        return this.saldo;
    }
    
    public void atualizarTitular(String nomeTitular){
        this.titular = nomeTitular;
    }
    
    public String titular(){
        return this.titular;
    }
    
    public void  atualizarTaixa(double Novataxa){
        if (this.taxa > 0){
            this.saldo = Novataxa;
        }
    }
    
    public void render(double valor){
        this.saldo += (this.saldo * this.taxa)/100;
    }
}
