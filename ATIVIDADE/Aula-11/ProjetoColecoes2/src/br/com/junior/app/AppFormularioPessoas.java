package br.com.junior.app;

import br.com.junior.modelo.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class AppFormularioPessoas {
    
    public static void main(String[] args) {
        
        Map<String, Pessoa> formPessoas = new HashMap<>();
        
        formPessoas.put("chefe" , new Pessoa("Hommer" , 40));
        formPessoas.put("gerente" , new Pessoa("Maria" , 42));
        formPessoas.put("estagiario" , new Pessoa("Bob" , 22));
        
        System.out.println(formPessoas);
    }
    
}
