package br.com.junior.datahora.app;

import java.util.Date;

public class AppTimestamp {
    
    public static void main(String[] args) {
        System.out.println(new Date().getTime());
        //1507073556885
        
        Date dataloka = new Date(0L);
        Date dataloka1 = new Date(2358976L);
        Date dataloka2 = new Date(-87894758L);
        
        System.out.println(dataloka);
        System.out.println(dataloka1);
        System.out.println(dataloka2);
    }
    
}
