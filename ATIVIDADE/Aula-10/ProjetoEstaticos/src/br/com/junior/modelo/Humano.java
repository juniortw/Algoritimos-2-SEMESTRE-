package br.com.junior.modelo;

public class Humano {
    
    private int idade;
    
    //Atributos "static" são chamados ATRIBUTOS DE CLASSES
    // Por convenção, atributos de classes possuem nomes
    //em CAIXA ALTA (separados por _)
    public static int IDADE_MAXIMA_RACA_HUMANA = 120;

    public Humano(int idade) {
        this.idade = idade;
    }
    
    public int getAnosMaximoVida(){
        return IDADE_MAXIMA_RACA_HUMANA - this.idade;
    }
    
}
