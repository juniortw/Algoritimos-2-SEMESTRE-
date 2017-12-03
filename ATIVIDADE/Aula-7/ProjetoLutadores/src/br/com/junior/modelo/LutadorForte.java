
package br.com.junior.modelo;


public class LutadorForte extends Lutador{

   
    public LutadorForte(double vida, double forca) {
        super(vida, forca);
    }

    @Override
    public double aplicarGolpe() {
       return this.forca * 3;
    }
    
    
}
