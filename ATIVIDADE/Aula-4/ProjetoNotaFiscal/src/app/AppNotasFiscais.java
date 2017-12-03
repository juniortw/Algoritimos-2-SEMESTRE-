
package app;

import modelo.Item;
import modelo.NotaFiscal;


public class AppNotasFiscais {
    
    public static void main(String[] args) {
        NotaFiscal nota1 = new NotaFiscal();
        
        Item item1 = new Item("Feijão", 2, 5);
        Item item2 = new Item("Arroz", 1, 15);
        Item item3 = new Item("Ovo", 30, 1);
        
        nota1.adicionarItem(item1);
        nota1.adicionarItem(item2);
        nota1.adicionarItem(item3);
        
        System.out.println("Valor total do item 1: "+item1.getValorTotal());
        System.out.println("Valor total do item 2: "+item2.getValorTotal());
        System.out.println("Valor total do item 3: "+item3.getValorTotal());
        
        System.out.println("Quantidade de itens da nota: "+nota1.getQuantidadeItens());
        
        System.out.println("Valor total da nota: "+nota1.getValorTotalNota());
        
    }
    
}
