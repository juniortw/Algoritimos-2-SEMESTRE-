
package modelo;

import java.util.ArrayList;
import java.util.List;


public class NotaFiscal {
    
    private String estabelecimento;
    private String dataCompra;
    //Lista que só aceita Item.
    private List<Item> itens = new ArrayList<>();

    
    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public List<Item> getItens() {
        return itens;
    }    
    
    public void adicionarItem(Item item){
        //Adicionando um item em uma lista 
        this.itens.add(item);        
    }
    
    public int getQuantidadeItens(){
        //Recuperando o tamanho de uma lista
        //Quantos itens foram adicionados
        return this.itens.size();
    }
    
    public double getValorTotalNota(){
        double total = 0;
        //ForEach ou Enhaced for
        for (Item item : this.itens){
            //Aqui, cada "item" é um objeto da lista na iteração
            total += item.getValorTotal();
        }
        
        return total;
    }
    
    
    
    
}
    
    
    
    
    
    
    

