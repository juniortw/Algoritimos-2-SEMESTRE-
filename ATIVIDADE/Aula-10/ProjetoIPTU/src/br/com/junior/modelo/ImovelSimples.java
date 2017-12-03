package br.com.junior.modelo;

public class ImovelSimples extends Imovel{

    @Override
    public double getValorReal() {
        return (getValor()*TAXA_SEMPLES) / 100;
    }
    
    
    
}
