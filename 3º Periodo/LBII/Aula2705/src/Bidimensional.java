public abstract class Bidimensional extends Forma{

	private double dime1, dime2;
	
	public Bidimensional() {
		this(0, 0, 0, 0);
	}
	
	public Bidimensional(double x, double y, double dime1, double dime2) {
		
		super(x, y);
		this.dime1 = dime1;
		this.dime1 = dime2;
		
	}// Fim do construtor, o X e o Y é a extensão de forma
	
	public void setDime1(double dime1) {
		this.dime1 = dime1;
	}
	public double getDime1() {
		return this.dime1;
	}
	public void setDime2(double dime2) {
		this.dime2 = dime2;
	}
	public double getDime2() {
		return this.dime2;
	}
	
	abstract public double area();
	
	@Override
	public String toString() {
		return String.format(" Forma Bidimensional, que é uma %s,", super.toString());
	}
}	