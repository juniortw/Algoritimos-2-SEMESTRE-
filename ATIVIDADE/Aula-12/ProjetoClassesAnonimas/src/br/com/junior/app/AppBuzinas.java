package br.com.junior.app;

import br.com.junior.modelo.Buzina;

public class AppBuzinas {
    
    public static void main(String[] args) {
        
        // Para criar um classe anônima, instanciamos criando
        // um "corpo" interno e sobrescrevendo os métodos
        // que desejamos e/ou precisamos
        Buzina buzinaFraca = new Buzina(){
            @Override
            public String buzinar() {
                return "biiiiiiii";
                }
        };
        System.out.println("buzinaFraca: "+buzinaFraca.buzinar());
        
        Buzina buzinaBarulhenta = new Buzina() {
            @Override
            public String buzinar() {
                return "Fonnnnnnnnnn";
            }
        };
        System.out.println("buzinaBarulhenta: "+buzinaBarulhenta.buzinar());
    }
    
}
