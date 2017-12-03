package br.com.junior.enums;

public enum TipoCartao {
    
    CREDITO("Crédito"),
    DEBITO("Débito"),
    VR("Vale Refeiçao"),
    VA("Vale ALimentação");
    
    private final String descricao;

    private TipoCartao(String descricao) {
        this.descricao = descricao;
    }
   
    
    
}
