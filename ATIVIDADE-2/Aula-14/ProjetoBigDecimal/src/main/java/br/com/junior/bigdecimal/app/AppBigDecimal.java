package br.com.junior.bigdecimal.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppBigDecimal {
    
    public static void main(String[] args) {
        double a=0.02;
        double b=0.03;
        double c=b-a;
        System.out.println(c);
        //o cálculo acima deu um resultado inexperado
        //devido ao uso de double
        
        //Façamos o mesmo com BigDecimal 
        BigDecimal n1 = new BigDecimal("0.02");
        BigDecimal n2 = new BigDecimal("0.03");
        BigDecimal n3 = n1.subtract(n2);
        System.out.println(n3);
        
        //Operações básicas com BigDecimal
        System.out.println(n1.add(n2));//somar
        System.out.println(n2.divide(n1));//divisão
        System.out.println(n1.multiply(n2));//multiplicação
        
        //Operações adicionais com BigDecimal
        System.out.println(n1.abs());//valor absoluto
        System.out.println(n1.negate());//inverte o sinal do número
        System.out.println(n1.negate().negate());//inverte o sinal do número 
        System.out.println(n1.max(n2));//retorna o maior valor
        System.out.println(n2.max(n1));//retorna o maior valor
        
        //Maneiras de criar um BigDecimal 
        BigDecimal n4 = BigDecimal.valueOf(1.879);
        BigDecimal n5 = BigDecimal.valueOf(77);
        BigDecimal n6 = BigDecimal.valueOf(77123, 2);
        BigDecimal n7 = BigDecimal.valueOf(1234567890L);
        
        //Conversões
        System.out.println(n1.intValue());//parte inteira 
        System.out.println(n3.doubleValue());//convertendo para double
        System.out.println(n7.longValue());//parte inteira longa
        
        //Arredondamentos
        BigDecimal valor1 = new BigDecimal("4.01");
        BigDecimal valor2 = new BigDecimal("4.41");
        BigDecimal valor3 = new BigDecimal("4.50");
        BigDecimal valor4 = new BigDecimal("4.51");
        BigDecimal valor5 = new BigDecimal("4.99");
        BigDecimal valor6 = new BigDecimal("3.5958");
        //setScale(<casas decimais>, <arredondamento>) 
        System.out.println("Valor 1 arredondado: "+valor5.setScale(0, RoundingMode.HALF_UP));
        System.out.println("Valor 6 arredondado: "+valor6.setScale(2, RoundingMode.HALF_DOWN));
        //setScale(<casas decimais>)
        System.out.println(valor2.setScale(2));
        //a linha abaixo derá erro por ser uma valor "limite" 
        //System.out.println(valor3.setScale(0));
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
