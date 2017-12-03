package br.com.bandtec.estabelecimentosjpa.utils;

import java.util.Scanner;

public class IOUtils {

    private static void mensagem(String mensagem) {
        System.out.println(mensagem+":");
    }
    
    private static Scanner getLeitor(String mensagem) {
        mensagem(mensagem);
        return new Scanner(System.in);
    }
    
    public static String lerString(String mensagem) {
        return getLeitor(mensagem).nextLine();
    }

    public static int lerInt(String mensagem) {
        return getLeitor(mensagem).nextInt();
    }

    public static double lerDouble(String mensagem) {
        return getLeitor(mensagem).nextDouble();
    }
    
    
}



