package Lista04;

public class Carro {
    
    String marca, modelo, combustivel;
    int ano;
    
    public Carro(){

    }
    
    public Carro(String marca, String modelo, String combustivel, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", combustivel=" + combustivel + ", marca=" + marca + ", modelo=" + modelo + "]";
    }
}
