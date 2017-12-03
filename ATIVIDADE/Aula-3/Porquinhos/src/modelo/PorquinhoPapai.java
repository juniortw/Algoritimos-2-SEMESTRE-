
package modelo;


public class PorquinhoPapai {
    
    private double valor = 5; 
    
    private String dono = "Filho"; 
    
    /*
      get = recupera valores 
      set = altera valores (usa void)
      Emcapsular é um jeito padrão de criar um metodo privado 
      e publico 
    */ 


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
