public class Assalariado extends Empregado{
    protected double salarioSemanal;

    public Assalariado(){
        this("Preencher", "Preencher", "Preencher", 400.0);
    }

    public Assalariado(String nome, String sobrenome, String matricula, double salarioSemanal){
        super(nome, sobrenome, matricula);
        if(salarioSemanal <= 0D) throw new IllegalArgumentException("Salario Invalido.");
        this.salarioSemanal = salarioSemanal;
    
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if(salarioSemanal <= 0D) throw new IllegalArgumentException("Salario Invalido.");
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: R$ %.2f", getClass().getName(), super.toString(), "Salario Semanal.", this.salarioSemanal);
    }

    @Override
    public double vencimentos(){
        return this.salarioSemanal;
    }
    
}