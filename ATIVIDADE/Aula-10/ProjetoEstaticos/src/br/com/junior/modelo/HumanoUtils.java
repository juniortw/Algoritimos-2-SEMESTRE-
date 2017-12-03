package br.com.junior.modelo;

import java.util.Random;

//Por conveção, classes que terminam com "Util", "Utils" ou "Helper"
//possuem métodos estáticos
public class HumanoUtils {
    
    //Métodos publicos e estáticos podem ser invocados
    // diretamente da classe, sem instanciá-la
    //ex: HumanoUtils.getFrasesMorte(...)
    public static String getFrasesMorte(Humano humano){
        if(humano.getAnosMaximoVida()>10){
            return "Pé na cova";
        } else {
            return "Vida longa pela frente";
        }
    }
    
    public static Humano getHumanoAleatorio(){
        int idade = new Random().nextInt(Humano.IDADE_MAXIMA_RACA_HUMANA);
        
        return new Humano(idade);
    }
}
