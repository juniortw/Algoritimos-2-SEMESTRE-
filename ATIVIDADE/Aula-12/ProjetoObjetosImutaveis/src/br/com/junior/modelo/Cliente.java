package br.com.junior.modelo;

public class Cliente {
    
    // O "final" antes do tipo terna o objeto IMUTÁVEL
    // ou seja, uma vez defenido o valor, não pode ser alterado
    private final Integer codigo;
    private final String cpf;
    private String nome;

    public Cliente(Integer codigo, String cpf) {
        this.codigo = codigo;
        this.cpf = cpf;
    }
    
    public void fake(){
        // Nem mesmo qa própria classe
        // pode alterar seus atributos IMUTÁVEIS
        //this.cpf = "abcd";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        // Argumentos (ou porâmetros) de métodos
        // também podem ser imutáveis
        
        // Nesse caso, a linha abaixo não iria compilar
        //nome = nome.toUpperCase();
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }
    
    
    
    
    
    
}
