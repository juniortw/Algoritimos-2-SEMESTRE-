
package br.com.junior.modelo;


public abstract class Lutador {
    
    private double vida; 
    protected double forca;
    

    public Lutador(double vida, double forca) {
        this.vida = vida;
        this.forca = forca;
    }

    public double getVida() {
        return vida;
    }
    
    public void receberGolpe(double forcaGolpe){
        
        if (forcaGolpe > this.vida){
            this.vida = 0;
        } else {
            this.vida -= forcaGolpe;
        }
        // soluçao em 1 linha 
        // this.vida = this.vida <= forcaGolpe ? 0 : this.vida - forcaGolpe;
        
        // outra solução em 1 linha 
        // this.vida -= Math.min(this.vida, forcaGolpe);
    }  
    
    public boolean isVivo(){
        return this.vida > 0;
    } 
    
    public boolean isMorto(){
        return this.vida == 0;
        // ou: return !isVivo();
    }
    
    public abstract double aplicarGolpe(); 
    
}
