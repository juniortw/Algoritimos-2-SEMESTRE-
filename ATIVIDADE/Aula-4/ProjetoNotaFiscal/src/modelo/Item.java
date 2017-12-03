

package modelo;


public class Item {
    
    private String descriçao; 
    private int quantidade; 
    private double valorUnitario;
    

    public Item(String descriçao, int quantidade, double valorUnitario) {
        this.descriçao = descriçao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }   
    
    
    public double getValorTotal(){
        return this.valorUnitario * this.quantidade;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
