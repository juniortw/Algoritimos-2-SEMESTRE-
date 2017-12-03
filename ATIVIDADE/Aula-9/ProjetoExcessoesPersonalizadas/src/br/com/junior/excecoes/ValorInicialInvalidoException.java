package br.com.junior.excecoes;

public class ValorInicialInvalidoException extends Exception{

    @Override
    public String getMessage() {
     return "O cofre não pode ser criado com valor negativo";
    }
    
    
}
