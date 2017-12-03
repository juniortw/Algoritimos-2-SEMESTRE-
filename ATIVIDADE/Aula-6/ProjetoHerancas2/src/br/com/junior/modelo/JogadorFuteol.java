
package br.com.junior.modelo;

// Esta classe é ABSTRATA, 
// PODE possuir métodos astratos.
// Não é possível INSTANCIAR um classe Astrata

public abstract class JogadorFuteol {
    
    //Um método astrato, NÃO POSSUI corpo
    public abstract void chutar(); 
    
    // É possivel ter métodos CONCRETOS numa classe abstrata 
    
    public void aquecer(){
        System.out.println("Jogador fazendo aquecimento");
    }
    
    
    
}
