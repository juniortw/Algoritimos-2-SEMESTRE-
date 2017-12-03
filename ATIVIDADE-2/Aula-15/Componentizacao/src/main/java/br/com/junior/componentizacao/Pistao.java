package br.com.junior.componentizacao;

public class Pistao {
    
    public void bombearCombustivel(double volume){
        if (volume < 0){
            throw new RuntimeException("Não é possível bombear valor negativo");
        }
        System.out.println("Bombeando "+volume+" litros de combustível");
    }
    
}
