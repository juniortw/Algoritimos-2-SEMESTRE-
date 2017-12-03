package br.com.junior.app;

import modelo.Aluno;

public class AppAlunos {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(1, "Zé Buduia");
        Aluno aluno2 = new Aluno(1, "Zé Buduia");
        
        if (aluno1.equals(aluno2)){
            System.out.println("aluno1 tem os mesmos valores de aluno2");
        }
        
        Aluno aluno3 = aluno2;
        
        if (aluno2 == aluno3){
            System.out.println("3 e 2 são o MESMO");
        }
        
        aluno2.setNome("Rosa Maria");
        
        System.out.println(aluno3.getNome());
    }
    
}
