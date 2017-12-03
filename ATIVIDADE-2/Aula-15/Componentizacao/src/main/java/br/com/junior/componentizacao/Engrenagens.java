package br.com.junior.componentizacao;

public class Engrenagens {
    
    public void rotacaoMotor(int rotacaoMotor){
        if (rotacaoMotor < 0){
            throw new RuntimeException("Motor não roda com valor negativo");
        }
    }
    
}
