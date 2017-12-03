package br.com.junior.projetocolecoes.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsApp {
    
    public static void main(String[] args) {
        
        List<String> frutas = Arrays.asList("uva", "abacaxi", "banana", "caju");
        
        //Filtrando a lista de frutas: colocando todas com a letra "U" em outra lsita 
        List<String> frutascomU = frutas.stream().filter((fruta) -> fruta.contains("u")).collect(Collectors.toList());
        System.out.println(frutascomU);
        
        List<String> frutas5Letras = frutas.stream().filter(fruta -> fruta.length() >=5).collect(Collectors.toList());
        System.out.println(frutas5Letras);
        
        long quantasFrutasComU = frutas.stream().filter(fruta -> fruta.contains("u")).count();
        System.out.println("Quantas com u? "+quantasFrutasComU);
        
        List<Aluno> alunos = Arrays.asList(
            new Aluno(11, "Zé"),
            new Aluno(22, "Zé2"),
            new Aluno(33, "Zé3"));
        
        //Filtrando apenas um atriuto dos elementos da lista
        List<String> nomes = alunos.stream().map(Aluno::getNome).collect(Collectors.toList());
        System.out.println(nomes);
            
        

    }
    
}
