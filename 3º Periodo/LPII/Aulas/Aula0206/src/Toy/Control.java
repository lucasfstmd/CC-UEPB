package Toy;
import java.io.PrintStream;

public class Control{
    
    private String tipo;
    private String modelo;

    public Control(){

    }
    
    public Control(String tipo, String modelo){
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public PrintStream moveToys(Toys toy){
        return System.out.printf("The %s esta se movendo.", toy.toString());
    }
    
    @Override
    public String toString() {
        return "Control [modelo=" + modelo + ", tipo=" + tipo + "]";
    }

}