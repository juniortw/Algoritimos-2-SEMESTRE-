
package br.com.junior.modelo;

// Podemos dizer que Zagueiro é uma subclasse de JogadorFutebol
// Também podemos dizer que Zagueiro é uam IMPLEMENTAÇAO de JogadorFutebol
public class Zagueiro extends JogadorFuteol{

    @Override
    public void chutar() {
        System.out.println("Zagueiro dando um chutão");    
    }
    
}
