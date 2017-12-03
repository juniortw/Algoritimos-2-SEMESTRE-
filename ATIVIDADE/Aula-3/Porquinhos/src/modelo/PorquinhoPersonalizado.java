package modelo;

public class PorquinhoPersonalizado {

    private double valor;

    private String dono;
    
    
    // Construtor
    public PorquinhoPersonalizado(double valor, String dono) {
        this.valor = valor;
        this.dono = dono;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
    
    

}
