
package modelo;


public class Biscoito {
    
    private String sabor; 
    private double peso; 
    private double caloriasPorUnidade; 
    private double preco; 

    public Biscoito(String sabor, double peso, double caloriasPorUnidade, double preco) {
        this.sabor = sabor;
        this.peso = peso;
        this.caloriasPorUnidade = caloriasPorUnidade;
        this.preco = preco;
    }
        

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }

    public void setCaloriasPorUnidade(double caloriasPorUnidade) {
        this.caloriasPorUnidade = caloriasPorUnidade;
    }

    public Biscoito(double preco) {
        this.preco = preco;
    }
    

    
    
    
}
