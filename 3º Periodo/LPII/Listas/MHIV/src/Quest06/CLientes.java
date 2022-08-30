package Quest06;

public class CLientes extends Pessoas {
    protected int codigo;

    public CLientes(String nome, String cpf, int codigo){
        super(nome, cpf);
        this.codigo = codigo;
    }

    public Clientes() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public String toString() {
        return "CLientes [codigo=" + codigo + "]";
    }

    @Override
    public String mostraDados(Pessoas pessoa) {
        return String.format("%s \nCodigo: %d", super.toString(), codigo);
        
    }

}
