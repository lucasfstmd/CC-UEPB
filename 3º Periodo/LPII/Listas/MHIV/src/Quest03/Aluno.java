package Quest03;

import java.util.Calendar;

public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno(String nome, String cpf, Calendar dataNasc, String matricula){
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return String.format("Aluno: %s, %s", super.toString(), matricula);
    }
}
