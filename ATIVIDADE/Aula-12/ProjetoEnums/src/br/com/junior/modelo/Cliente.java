package br.com.junior.modelo;

import br.com.junior.enums.FaixaEtaria;
import br.com.junior.enums.RendaFamiliar;

public class Cliente {
    
    private String nome;
    private FaixaEtaria faixaEtaria;
    private RendaFamiliar rendaFamiliar;

    public Cliente(String nome, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public RendaFamiliar getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(RendaFamiliar rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }
    
    
    
    
    
}
