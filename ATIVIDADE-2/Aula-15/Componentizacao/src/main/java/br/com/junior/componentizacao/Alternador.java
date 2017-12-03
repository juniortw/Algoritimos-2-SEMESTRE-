package br.com.junior.componentizacao;

public class Alternador {
    
    public double converteEnergia(double energiaMecanica){
        if (energiaMecanica < 0){
            throw new RuntimeException("Não é possível converter energia negativa");
        }
        return energiaMecanica*0.2;
    }
    
}
