package br.com.coutinho.modelo;

public class Cachorro extends Animal {

    @Override
    protected void nascer() {
        System.out.println("Mais um AUAU no mundo");
    }

    @Override
    public void comer(String alimento) {
        System.out.println("AUAU comendo "+alimento);
    }

    @Override
    public String emitirSom() {
        return "Só as cachorras...AUAU";

    }

}
