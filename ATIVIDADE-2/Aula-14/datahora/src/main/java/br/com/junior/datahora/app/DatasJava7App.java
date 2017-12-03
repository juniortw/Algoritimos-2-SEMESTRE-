package br.com.junior.datahora.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasJava7App {
    //Trabalhando com datas até o Java 7
    public static void main(String[] args) throws ParseException {
        //Formatando Datas
        Date agora = new Date();
        
        //Formatando para dd/mm/aaaa
        String agoraBonito = new SimpleDateFormat("EEEE dd/MM/yyyy G hh:mm a").format(agora);
        
        System.out.println("Agora: "+agoraBonito);
        
        //Criando uma data a partir de um texto
        String nascimento = "17/09/1991";
        Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
        System.out.println("nascimento: "+dataNascimento);
        
        //Extraindo informações da data
        Calendar calNascimento = Calendar.getInstance();
        calNascimento.setTime(dataNascimento);
        
        System.out.println("Dia da semana: "+calNascimento.get(Calendar.DAY_OF_WEEK));
        System.out.println("Mês: "+calNascimento.get(Calendar.MONTH));
        
        //Operações com data 
        
        //Ex: Add 30 dias à data
        calNascimento.add(Calendar.DATE, 30);
        System.out.println(calNascimento.getTime());
        
        //Ex: Add 2 meses à data
        calNascimento.add(Calendar.MONTH, 2);
        System.out.println(calNascimento.getTime());
        
        //Ex: Regredindo 15 dias na data
        calNascimento.add(Calendar.DATE, -15);
        System.out.println(calNascimento.getTime());
        
        //Ex: Diferença entre datas
        //Usando o timestamp: 
        Long diferencaMilisigundos = agora.getTime() - dataNascimento.getTime();
        System.out.println("Você nasceu há "+diferencaMilisigundos+ "ms");
        
        long dias = diferencaMilisigundos/1000/60/60/24; 
        long anos = dias/365; 
        
        System.out.println("Dias de vida: "+dias);
        System.out.println("Anos de vida: "+anos);
                
    }
    
}
