package br.com.junior.enums;

public class Compra {
    
    protected final Integer id;
    protected final Double valorTotal;
    protected final TipoCartao tipoCartaoPagamento; 

    public Compra(Integer id, Double valorTotal, TipoCartao tipoCartaoPagamento) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.tipoCartaoPagamento = tipoCartaoPagamento;
    }

    public Integer getId() {
        return id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public TipoCartao getTipoCartaoPagamento() {
        return tipoCartaoPagamento;
    }
    
    
    
    
    
    
}
