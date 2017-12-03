
package modelo;


public class GrupoPorquinhos {
    
    private PorquinhoPersonalizado porquinho1;
    private PorquinhoPersonalizado porquinho2;

    public PorquinhoPersonalizado getPorquinho1() {
        return porquinho1;
    }

    public void setPorquinho1(PorquinhoPersonalizado porquinho1) {
        this.porquinho1 = porquinho1;
    }

    public PorquinhoPersonalizado getPorquinho2() {
        return porquinho2;
    }

    public void setPorquinho2(PorquinhoPersonalizado porquinho2) {
        this.porquinho2 = porquinho2;
    }
    
    public double getSomaPorquinhos(){
        double somaPorquinhos = 0;
        
        if (this.porquinho1 != null){
            somaPorquinhos += this.porquinho1.getValor();
        }
        
        if (this.porquinho2 != null){
            somaPorquinhos += this.porquinho2.getValor();
        }
        
        return somaPorquinhos;
        
    }
    
    
}
