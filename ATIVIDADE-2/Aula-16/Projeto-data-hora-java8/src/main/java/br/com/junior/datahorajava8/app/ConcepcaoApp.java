package br.com.junior.datahorajava8.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import javafx.util.converter.LocalDateStringConverter;

public class ConcepcaoApp {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Qual a data de nascimento");
        String data = leitor.next();
        
        LocalDate dataConvertida = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        
        LocalDate hoje = LocalDate.now();
        
        long diasDeVida = ChronoUnit.YEARS.between(dataConvertida, hoje);
        System.out.println("Você tem "+diasDeVida+ "anos");
        
        LocalDate prematuro = dataConvertida.plusMonths(7);
        LocalDate naoPrematuro = dataConvertida.plusMonths(9);
        
        System.out.println("Você foi concebibo provavelmente em "+prematuro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Você foi concebibo provavelmente em "+naoPrematuro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    
    
    
    }
    
}
