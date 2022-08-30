package Quest03;

import java.util.Calendar;

public class Funcionarios extends Pessoa {
    
    protected String matricula;
    protected Calendar dataAdmissao;
    protected double salario;

    public Funcionarios(String nome, String cpf, Calendar dataNasc, String matricula, Calendar dataAdmissao, double salario){
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Funcionario: %s, matricula: %s, data de Adimissao: %s, salario: %.2f ", super.toString(), matricula, dataAdmissao, salario);    }

    
    
}
