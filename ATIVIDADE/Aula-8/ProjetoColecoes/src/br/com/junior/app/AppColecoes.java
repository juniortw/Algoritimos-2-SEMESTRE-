
package br.com.junior.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import modelo.Aluno;
import modelo.Turma;


public class AppColecoes {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno(1, "Zé");
        Aluno a2 = new Aluno(2, "Bi");
        Aluno a3 = new Aluno(3, "Du");
        
        // List ACEITA elementos repetidos        
        List<Aluno> listAlunos = new ArrayList<>();
        listAlunos.add(a1);
        listAlunos.add(a2);
        listAlunos.add(a3);
        listAlunos.add(a3);
        
        System.out.println("Quantos na lista? "+listAlunos.size());
        
        a2.setNome("Debuia");
        System.out.println("Qual nome do 2º? "+listAlunos.get(1).getNome());
        
        listAlunos.get(1).setNome("Roberio");
        System.out.println("Nome de a2: "+a2.getNome());
        
        // Set NÃO PERMITE elementos repetidos
        // A implementação HashSet não guarda na ordem de adição, pois usar o "hash" do objeto.
        Set<Aluno> conjuntoAlunos = new HashSet<>();
        conjuntoAlunos.add(a1);
        conjuntoAlunos.add(a2);
        conjuntoAlunos.add(a3);
        conjuntoAlunos.add(a3);
        
        System.out.println("Quantos no conjunto? "+conjuntoAlunos.size());
        
        Aluno a4 = new Aluno(a1.getMatricula(),a1.getNome());
        conjuntoAlunos.add(a4);
        
        System.out.println("Quantos no conjunto? "+conjuntoAlunos.size());
        
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        Turma t3 = new Turma();
        
        List<Turma>listaTurmas = new ArrayList<>();
        listaTurmas.add(t1);
        listaTurmas.add(t2);
        listaTurmas.add(t3);
        
        Set<Turma>setTurmas = new LinkedHashSet<>();
        setTurmas.add(t1);
        setTurmas.add(t2);
        setTurmas.add(t3);
                
    }
    
}
