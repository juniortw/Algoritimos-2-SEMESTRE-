package br.com.junior.componentizacao;

public class Motor {
    
    //Ao usarmos atributos dos tipos abaixo 
    //estamos fazendo um tipo de herança, chamando "has a"
    private Vela vela;
    private Pistao pistao;
    private Alternador alternador;
    private Girar girar;
    
    public Motor(){
        this.vela = new Vela();
        this.pistao = new Pistao();
        this.alternador = new Alternador();
    }
            
    
    public void produzirFaiscaIgnicao(){
        this.vela.produzFaiscaIngnicao();
    }
    
    public void bombearCombustivel(double volume){
        this.pistao.bombearCombustivel(volume);
    }
    
    public double converterEnergia(double energiaMecanica){
        return this.alternador.converteEnergia(energiaMecanica);
    }
    
    public void Girar(){
        this.girar.rpm(3);
    }
            
            
    
}
