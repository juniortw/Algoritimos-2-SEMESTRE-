
package br.com.junior.modelo;


public abstract class MaquinaCafe {
    
    private int porcoes;
    
    

    public int getPorcoes() {
        return porcoes;
    }
    
    public abstract boolean validarCredito(double credito);
    
    protected String getMensagem(){
        return getMensagem();
    }
    
    public String produzirExpresso(double creedito){
        if (porcoes <= 0){
            System.out.println("Não há mais café na maquina");
        } else {
            validarCredito()
        }
    }
}
