package br.com.junior.app;

import java.util.HashMap;
import java.util.Map;

public class AppFormularisoComplexos {
    
    public static void main(String[] args) {
        
        Map<String, Object> formPrincipal = new HashMap<>();
        Map<String, Object> formTelefones = new HashMap<>();
        
        formPrincipal.put("Nome ", " Zé Ruela");
        formPrincipal.put("nascimento ", " 10/01/2000");
        formPrincipal.put("bairro ", " itaquera");
        
        formTelefones.put("telefone 1 ", " 1111-1111");
        formTelefones.put("telefone 2 ", " 2222-2222");
        formTelefones.put("telefone 1 ", " 3333-3333");
        
        formPrincipal.put("telefones", formTelefones);
        
        System.out.println(formPrincipal);
    }
    
}
