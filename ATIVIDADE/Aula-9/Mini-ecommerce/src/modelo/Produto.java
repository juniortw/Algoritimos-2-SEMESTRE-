package modelo;

import Exception.NomeInvalidoException;
import Exception.PrecoInvalidoException;

public class Produto {
    
    private String nome; 
    private int precoUnitario; 

    public Produto(String nome, int precoUnitario) throws NomeInvalidoException, PrecoInvalidoException {
        this.nome = nome;
        if(nome == null){
            throw new NomeInvalidoException();
        }
        
        if(nome.length() < 3){
            throw new NomeInvalidoException();
        }
        
        this.precoUnitario = precoUnitario;
        
        if(precoUnitario <= 0){
            throw new PrecoInvalidoException();
        }
    }
        
    public String getNome()  {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrecoUnitario()  {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    
    
}
