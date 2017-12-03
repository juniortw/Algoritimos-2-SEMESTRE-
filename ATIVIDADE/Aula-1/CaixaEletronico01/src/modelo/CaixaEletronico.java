
package modelo;


public class CaixaEletronico {
 
    // Atributo quase sempre são PRIVADO "bancos"
    private String bancos;
    
    // Atributo de intância PRIVADO "horarioInicio"
    private int horarioInicio;
    
    // Atributo de intância PRIVADO "horarioFim"
    private int horarioFim;
    
    // Atributo de intância PRIVADO "dinheiro"
    private double dinheiro;
    
    
    // Metodo público "sacar"
    public void sacar(double valorSolicitado) {
        if (this.dinheiro >= valorSolicitado){
            this.dinheiro -= valorSolicitado;
            System.out.println(valorSolicitado +" sacado com sucesso. Saldo "+this.dinheiro);
        } else {
            System.out.println("Valor solicitado não pode ser sacado!");
        }
    }
    
    public void depositar(double valorDeposito){
        this.dinheiro += valorDeposito;
        System.out.println(valorDeposito+" Depositado com sucesso!");
    } 
    
    // Método público "configurarBancos"
    public void configurarBancos(String novosBancos){
        this.bancos = novosBancos;
    }
    
    // Métodos público "bancosDisponiveis"
    public String bancosDisponiveis(){
        return this.bancos != null ? this.bancos : "Nenhum";
    }
}                                                       