package br.com.coutinho.app;

import br.com.coutinho.modelo.Animal;
import br.com.coutinho.modelo.Cachorro;
import br.com.coutinho.modelo.Gato;

public class AppAnimal {

    public static void main(String[] args) {
        Animal pet1 = new Animal();
        pet1.comer("chumbinho");
        System.out.println(pet1.emitirSom());

        Gato bichano = new Gato();
        bichano.comer("rato");
        System.out.println(bichano.emitirSom());
        bichano.setIdade(5);
        System.out.println("A idade do BICHANO é: " + bichano.getIdade());
        bichano.cuspirBolaDePelo();

        //o "bichoLoko" vai se comportar como Gato
        //em tempo de execução
        Animal bichoLoko = new Gato();
        System.out.println(bichoLoko.emitirSom());
        //a linha abaixo não funciona porque
        //bichoLoko foi DECLARADO como Animal
        //bichoLoko.cuspirBolaDePelo();
        
        Cachorro dog1 = new Cachorro();
        dog1.comer("pão");
        dog1.emitirSom();
        
        Animal dog2 = new Cachorro();
        dog2.comer("pizza");
        dog2.emitirSom();
    }

}
