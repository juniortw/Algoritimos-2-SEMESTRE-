
package modelo;


public class Crianca {
    
    private String nome;
    private int idade;
    private String sexo;
    

    public Crianca(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0){
        this.idade = idade;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("M") || sexo.equals("F")){
        this.sexo = sexo;
        }
    }
    
    
    
}
