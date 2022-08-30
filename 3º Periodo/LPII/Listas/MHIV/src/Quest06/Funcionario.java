package Quest06;

public abstract class Funcionario extends Pessoas {
    protected String mtricula;
    protected double salario;

    public Funcionario(String nome, String cpf, String matricula, double salario){
        super(nome, cpf);
        this.mtricula = matricula;
        this.salario = salario;
    }

    public Funcionario() {}

    public String getMtricula() {
        return mtricula;
    }

    public void setMtricula(String mtricula) {
        this.mtricula = mtricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return String.format("\nFuncionario: %s\nMatricula: %s\nSalario: %.2f", super.toString(), mtricula, salario);
    }

    @Override
    public String mostraDados(Pessoas pessoa){
        return String.format("%s\n%s", super.toString(), toString());
    }

}
