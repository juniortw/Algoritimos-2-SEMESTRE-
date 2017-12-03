package br.com.bandtec.estabelecimentosjpa.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Estabelecimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estabelecimento")
    private Long id; 
    
    @Column(length = 50, nullable = false)
    private String nome;
    
    @CreationTimestamp
    @Column(name = "data_criacao")
    private Calendar dataCriacao;
    
    @JoinColumn(name = "id_tipo_estabelecimento")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoEstabelecimento tipo; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public TipoEstabelecimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstabelecimento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + '}';
    }
    
    
    
}






