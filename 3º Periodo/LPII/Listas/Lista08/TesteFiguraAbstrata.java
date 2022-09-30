package Lista08;

public class TesteFiguraAbstrata {
    public static void main(String[] args) {
        
        FiguraAbstrata triangulo = new Triangulo("Arestas - A", "Dimensao - A");
        FiguraAbstrata trapezio = new Trapezio("Arestas - B", "Dimensao - B");

        trapezio.desenhar();
        triangulo.desenhar();
    }
    
}
