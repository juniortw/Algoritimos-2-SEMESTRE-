package br.com.junior.datahorajava8.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateApp {
    
    public static void main(String[] args) {
        //Para lidar com Datas SEM a hora, min e seg usamos a LocalDate
        
        //LocalDate de "hoje"
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("MMMM")));
        System.out.println(hoje.getMonth());
        System.out.println(hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt")));
        
        //Criando uma data a partir de dia, mês e ano
        LocalDate nascimento = LocalDate.of(1991, 9, 17);
        System.out.println("Meu nascimento: "+nascimento);
        
        //Criando uma data a partir de uma String
        LocalDate dataloka = LocalDate.parse("01/01/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dataloka);
        
        //Calculando a diferença de tempo
        Period periodo = Period.between(nascimento, hoje);
        System.out.println("Idade completa"+
                periodo.getYears()+ " Anos" +
                periodo.getMonths()+ " meses" +
                periodo.getDays()+ " dias"); 
        
        //Para calculos de diferenças específicas, usamos o ChronoUnit.XXX.between
        long diasDeVida = ChronoUnit.DAYS.between(nascimento, hoje);
        System.out.println("Dias de vida: "+diasDeVida);
        
        //Add ou retirando tempo de uma Data
        System.out.println(dataloka);
        LocalDate dataloka2 = dataloka.plusDays(2);
        System.out.println(dataloka2);
        LocalDate dataloka3 = dataloka.minusDays(3);
        System.out.println(dataloka3);
        
        
    }
    
}
