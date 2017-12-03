
package br.com.junior.modelo;


public class LutadorFraco extends Lutador{

    public LutadorFraco(double vida, double forca) {
        super(vida, forca);
    }

    @Override
    public double aplicarGolpe() {
        return this.forca * 0.8;
    }
    
    
}
