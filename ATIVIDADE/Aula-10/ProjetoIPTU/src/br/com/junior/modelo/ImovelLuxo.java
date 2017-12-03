package br.com.junior.modelo;

public class ImovelLuxo extends Imovel{

    @Override
    public double getValorReal() {
        return (getValor()*TAXA_LUXO) / 100;
    }
    
    
    
}
