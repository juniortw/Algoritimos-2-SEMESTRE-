package app;

import Exception.NomeInvalidoException;
import Exception.PrecoInvalidoException;
import modelo.Produto;

public class AppLoja {

    public static void main(String[] args) throws NomeInvalidoException, PrecoInvalidoException {

        try {
            Produto mercadinho = new Produto("Maça", 10);
            mercadinho.getNome();
            mercadinho.getPrecoUnitario();
        } catch (NomeInvalidoException noex) {
            System.out.println("O nome do produto: " + noex.getMessage());
        } catch (PrecoInvalidoException prex) {
            System.out.println("O preço do produto: " + prex.getMessage());
        }
    }

}
