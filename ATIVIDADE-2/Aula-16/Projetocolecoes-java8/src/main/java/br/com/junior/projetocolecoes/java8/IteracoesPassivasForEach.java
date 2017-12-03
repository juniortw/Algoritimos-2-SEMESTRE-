package br.com.junior.projetocolecoes.java8;

import java.util.Arrays;
import java.util.List;

public class IteracoesPassivasForEach {
    
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("uva", "abacaxi", "banana", "caju");
        
        //Interação passiva com "forEach"
        frutas.forEach(fruta -> {
            System.out.println(fruta);
        });
        
        List<Aluno> alunos = Arrays.asList(
                new Aluno(11, "Zé"),
                new Aluno(22, "Zé2"),
                new Aluno(33, "Zé3"));
        
        System.out.println(alunos);
        
        alunos.forEach(aluno -> {
            aluno.setMatricula(0);
            aluno.setNome("N/A");
        });
        System.out.println(alunos);
        
    }
    
}
