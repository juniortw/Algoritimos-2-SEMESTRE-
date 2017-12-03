package br.com.junior.projetocolecoes.java8;

import java.util.Arrays;
import java.util.List;

public class OrdenacaoApp {
    
    public static void main(String[] args) {
        
        List<Aluno> alunos = Arrays.asList(
            new Aluno(33, "Zé"),
            new Aluno(11, "Jula"),
            new Aluno(22, "Dunha"));
        
        //Ordenando pelo número de matrícula    
        alunos.sort((Aluno a1, Aluno a2) -> a1.getMatricula() - a2.getMatricula());
        System.out.println(alunos);
        
        //Ordenando pelo nome    
        alunos.sort((Aluno a1, Aluno a2) -> a1.getNome().compareTo(a2.getNome()));
        System.out.println(alunos);
    }
    
}
