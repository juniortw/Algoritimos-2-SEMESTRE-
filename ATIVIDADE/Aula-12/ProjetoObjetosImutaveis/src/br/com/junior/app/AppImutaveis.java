package br.com.junior.app;

import java.util.Scanner;

public class AppImutaveis {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu bairro?");
        final String bairro = leitor.nextLine();
        
        System.out.println("Qual seu idade?");
        final Integer idade = leitor.nextInt();
        
        // As linhas abaixos provocariam erro de compilação
        // pois "bairro" e "idade" são imutáveis!
        //bairro = "São Judas";
        //idade = 80;
    }
    
}
