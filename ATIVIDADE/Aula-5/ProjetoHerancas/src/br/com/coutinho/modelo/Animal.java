package br.com.coutinho.modelo;

public class Animal {

    private String sexo;
    private double peso;
    private int idade;

    public Animal() {
        this.nascer();
    }

    //"protected" significa que o método só pode ser invocado
    //da própria classe ou de suas "sub classes" (ex: Gato)
    protected void nascer() {
        System.out.println("Animal nasceu");
    }

    public String getSexo() {
        return sexo;
    }

    public void comer(String alimento) {
        System.out.println("Animal comendo " + alimento);
        
    }
   

    public String emitirSom() {
        return "som do animal";
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
