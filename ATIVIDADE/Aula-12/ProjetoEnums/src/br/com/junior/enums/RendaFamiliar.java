package br.com.junior.enums;

public enum RendaFamiliar {
    
    // Uma enum pode ter quantas características (atributos) quisermos
    CLASSE_E("Miserável", 0.0, 200.00),
    CLASSE_D("Pobre", 200.01, 940.00),
    CLASSE_C("Classe Média", 940.01, 1800.00),
    CLASSE_B("Classe Média Alta", 1800.01, 10000.00),
    CLASSE_A("Ricos", 10000.01, null);
    
    private String descricao;
    private Double minimo;
    private Double maximo;
    
    // CASO os enum tenham atributos, 
    // deve, OBRIGATORIAMENTE ser criado um construtor
    // com parâmetros na mesma ordem deles
    private RendaFamiliar(String descricao, Double minimo, Double maximo) {
        this.descricao = descricao;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getMinimo() {
        return minimo;
    }

    public Double getMaximo() {
        return maximo;
    }
    
    
    
    
    
            
    
}
