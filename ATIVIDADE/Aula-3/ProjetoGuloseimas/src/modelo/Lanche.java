
package modelo;

public class Lanche {
    
    private String tipo; 
    private Biscoito biscoitoLanche; 
    
    public Lanche(String tipo, Biscoito biscoitoLanche){
        this.tipo = tipo;
        this.biscoitoLanche = biscoitoLanche;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lanche(Biscoito biscoitoLanche) {
        this.biscoitoLanche = biscoitoLanche;
    }
    
    
    
    
}
