package br.com.junior.datahorajava8.app;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class InstantApp {
    
    public static void main(String[] args) {
        //Quando queremos manipular "instantes",
        //usando a Instant(normalmente operações computacional)
        
        //Recuperando o instante atual ("o agora")
        Instant agora = Instant.now();
        System.out.println(agora);
        
        //Recuperando o valor do instante em outras TimeZones(outros fuso horários)
        System.out.println(agora.atZone(ZoneId.of("Japan")));
        System.out.println(agora.atZone(ZoneId.of("America/Sao_Paulo")));
        
        Instant agoraFinal = Instant.now();
        
        //Para calcular a diferença de tempo entre Instant, usamos o Duration
        Duration duracao = Duration.between(agora, agoraFinal);
        System.out.println("Quantos milisegundos? "+duracao.toMillis());
        
    }
    
    
}
