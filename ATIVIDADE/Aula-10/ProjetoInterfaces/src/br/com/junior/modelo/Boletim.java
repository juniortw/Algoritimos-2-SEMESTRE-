package br.com.junior.modelo;

// Interface são como classes 100% abstratas 
// ou seja, não é possível ter métodos concretos (como corpo)
public interface Boletim {
    
    //Não é possível ter atributos de instância numa interface 
    
    //Não é possível definir CONTRUTOR numa interface
    
    // Todo método numa interface é por padrão:
    // abstrato e público
    public abstract boolean isAprovado();
    
        
}
