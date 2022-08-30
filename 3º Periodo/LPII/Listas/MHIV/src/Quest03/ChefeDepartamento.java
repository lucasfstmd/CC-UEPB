package Quest03;

import java.util.Calendar;

public class ChefeDepartamento extends Funcionarios {
    protected String departamento;
    protected Calendar dataPromocao;
    protected double gratificacao;

    public ChefeDepartamento(String nome, String cpf, Calendar dataNasc, 
                            String matricula, Calendar dataAdmissao, double salario, 
                            String departamento, Calendar dataPromocao, double gratificacao){
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Calendar getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(Calendar dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString(){
        return String.format("Chefe de Departamento: %s, %s %s %.2f", super.toString(), departamento, dataPromocao, gratificacao);
    }
}
