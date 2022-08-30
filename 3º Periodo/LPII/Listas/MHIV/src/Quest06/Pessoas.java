package Quest06;

public abstract class Pessoas {
    protected String nome;
    protected String cpf;

    public Pessoas(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    public Pessoas(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "cpf: " + cpf + ", nome: " + nome;
    }

    public abstract String mostraDados(Pessoas pessoa);
}
