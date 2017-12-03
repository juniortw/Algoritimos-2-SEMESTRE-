package br.com.junior.enums;


public class CompraLoja extends Compra {

    public CompraLoja(Integer id, Double valorTotal, TipoCartao tipoCartaoPagamento) throws TipoPagamentoInvalidoException {
        super(id, valorTotal, tipoCartaoPagamento);
    if(tipoCartaoPagamento==TipoCartao.VA || tipoCartaoPagamento==TipoCartao.VR){
        throw new TipoPagamentoInvalidoException(); 
    }
    }
    

    
    
    
}
