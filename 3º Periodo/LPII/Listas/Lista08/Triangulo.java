package Lista08;

public class Triangulo extends FiguraAbstrata{

    public Triangulo(String aresta, String dime) {
        super(aresta, dime);
    }
    
    @Override
    protected void desenhar(){
        System.out.println("Triângulo desenhado.");
    }
}
