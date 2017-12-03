package br.com.junior.modelo;

public class BoletimBonzinho implements Boletim{
    
    private double nota1;
    private double nota2;

    public BoletimBonzinho(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public boolean isAprovado() {
        return(this.nota1 + this.nota2)/2>5;
    }
    
}