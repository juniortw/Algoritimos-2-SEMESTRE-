package br.com.junior.projetomaven1;

public class Cartel {
    
    private int vitorias;
    private int derrotas;
    private int empates;

    public Cartel(int vitorias, int derrota, int empate) {
        this.vitorias = vitorias;
        this.derrotas = derrota;
        this.empates = empate;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrota() {
        return derrotas;
    }

    public void setDerrota(int derrota) {
        this.derrotas = derrota;
    }

    public int getEmpate() {
        return empates;
    }

    public void setEmpate(int empate) {
        this.empates = empate;
    }
    
    
    
}
