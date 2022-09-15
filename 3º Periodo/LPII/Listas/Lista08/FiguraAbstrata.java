package Lista08;

public abstract class FiguraAbstrata {
    protected String dime;
    protected String aresta;
    
    public FiguraAbstrata(String aresta, String dime) {
        this.dime = dime;
        this.aresta = aresta;
    }

    public String getDime() {
        return dime;
    }

    public void setDime(String dime) {
        this.dime = dime;
    }

    public String getAresta() {
        return aresta;
    }

    public void setAresta(String aresta) {
        this.aresta = aresta;
    }

    protected abstract void desenhar();

    @Override
    public String toString() {
        return "FiguraAbstrata [aresta = " + aresta + ", dimensao = " + dime + "]";
    }
}
