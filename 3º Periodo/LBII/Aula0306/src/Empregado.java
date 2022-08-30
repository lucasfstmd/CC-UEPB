public abstract class Empregado{
	private String nome, sobrenome, matricula;
	
	public Empregado() {
		
	}
	public Empregado(String nome, String sobrenome, String matricula) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return String.format("%s %s\n%s", nome, sobrenome, matricula);
	}
	
	public abstract double vencimentos();
		

}