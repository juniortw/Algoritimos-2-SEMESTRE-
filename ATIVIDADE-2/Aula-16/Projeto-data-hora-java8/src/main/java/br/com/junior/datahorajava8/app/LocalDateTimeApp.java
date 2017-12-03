package br.com.junior.datahorajava8.app;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeApp {
    
    public static void main(String[] args) {
        
        //Para lidar com datar que precisam da hora, min e seg. Usamos o LocalDateTime
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        //É possível informar: ano, mês, dia, hora, minuto, seg, miliseg
        LocalDateTime nascimento = LocalDateTime.of(1991, 9, 17, 12, 30);
        System.out.println(nascimento);
        
        long horasDeVida = ChronoUnit.HOURS.between(nascimento, agora);
        System.out.println("Horas de vida "+horasDeVida);
        
    }
    
}
