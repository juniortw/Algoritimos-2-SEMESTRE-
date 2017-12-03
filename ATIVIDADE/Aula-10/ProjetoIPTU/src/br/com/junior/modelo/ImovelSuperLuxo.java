package br.com.junior.modelo;

public class ImovelSuperLuxo extends ImovelLuxo{
    
    @Override
    public double getValorReal() {
        return (getValor()*TAXA_SUPERLUXO) / 100;
    }
    
}
