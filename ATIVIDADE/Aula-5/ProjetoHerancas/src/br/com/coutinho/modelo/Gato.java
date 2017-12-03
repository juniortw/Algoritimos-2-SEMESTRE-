package br.com.coutinho.modelo;
//Gato é um tipo de animal,certo?
//então poderemos dizer que Gato ESTENDE Animal
//assim, vários métodos e características de Animal
//serão HERDADOS por Gato

public class Gato extends Animal {

    //SOBRESCRITA do método "emitirSom()" ou o método foi SOBRESCRITO.
    @Override
    public String emitirSom() {
        return "miaaaaaaaaaaaau";
    }

    public void cuspirBolaDePelo() {
        System.out.println("Gato cuspindo bolinha de pêlo");
    }

   
    @Override
    protected void nascer() {
        System.out.println("Gato nascendo");
    }
    

}
