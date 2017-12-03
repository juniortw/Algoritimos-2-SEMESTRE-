package br.com.junior.datahora.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class IdadeApp {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner leitor = new Scanner(System.in);
        
        Date format = new Date();
        
        System.out.println("Qual a data de fabricação do produto?");
        String resposta = leitor.next(); 
        
        Date dataFabricacao = new SimpleDateFormat("dd-MM-yyyy").parse(resposta);
        
        System.out.println("Quantas dias ele vale?");
        int respsota2 = leitor.nextInt();
        
        Calendar calVencimento = Calendar.getInstance();
        
        int resp = Integer.parseInt(resposta);
        
        if (format.getTime() > respsota2){
        calVencimento.add(Calendar.DATE, resp);
        System.out.println("Ele vence em "+resp+ "dias");
        } else {
        calVencimento.add(Calendar.DATE, -resp);
        System.out.println("Ele vence em "+resp+ "dias");
        }
    }
        
    
}
