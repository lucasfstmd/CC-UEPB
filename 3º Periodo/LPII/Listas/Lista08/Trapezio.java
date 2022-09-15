package Lista08;

public class Trapezio extends FiguraAbstrata{

    public Trapezio(String aresta, String dime) {
        super(aresta, dime);
    }

    @Override
    protected void desenhar(){
        System.out.println("Trapezio desenhado.");
    }
}
