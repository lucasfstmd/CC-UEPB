package Quest06;

public class Gerente extends Funcionario {
    protected int area;

    public Gerente(String nome, String cpf, String matricula, double salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    public Gerente() {}

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Gerente [area=" + area + "]";
    }
    
    @Override
    public String mostraDados(Pessoas pessoa){
        return String.format("%s\n%s", super.toString(), toString());
    }
}
