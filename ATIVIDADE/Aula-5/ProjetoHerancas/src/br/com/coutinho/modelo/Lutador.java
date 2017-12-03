
package br.com.coutinho.modelo;


public class Lutador {
    
    private String nome;
    private int forca = 50;
    private int vida = 100;

    public int getVida() {
        return vida;
    }

       
    public void socoFraco(){
        System.out.println("Dando soco fraco com força "+(this.forca/2));
    }
    
    public void socoForte(){
        System.out.println("Dando soco forte com força "+this.forca);
    }
    
    public void chuteFraco(){
        System.out.println("Dando chute fraco com força "+(this.forca/2));
    }
    
    public void chuteForte(){
        System.out.println("Dando chute forte com força "+this.forca);
    }
    
    public void receberGolpe(int valor){
        System.out.println("Lutador perdendo "+valor);
        this.vida -= valor;
    }
}
