package Toy;
public class Toys{

    private String modelo;
    private String tipo;
    private float preco;

    public Toys(){

    }

    public Toys(String modelo, float preco){
        this.modelo = modelo;
        this.preco = preco;
    }

    public Toys(String modelo, String tipo, float preco) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Toys [modelo=" + modelo + ", preco=" + preco + ", tipo=" + tipo + "]");
    }

    

}