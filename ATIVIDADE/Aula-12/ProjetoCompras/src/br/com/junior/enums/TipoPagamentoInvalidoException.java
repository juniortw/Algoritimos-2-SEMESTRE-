package br.com.junior.enums;


public class TipoPagamentoInvalidoException extends Exception {
@Override
    public String getMessage(){
        return "Só aceitamos crédito e débito";
    }    
}
