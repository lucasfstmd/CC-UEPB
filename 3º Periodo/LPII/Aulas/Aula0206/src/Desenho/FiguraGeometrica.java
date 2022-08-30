package Desenho;

public abstract class FiguraGeometrica {
    
    private String tipo;

    public FiguraGeometrica(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [tipo=" + tipo + "]";
    }

}
