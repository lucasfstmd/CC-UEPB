public class Quadrado extends Bidimensional{
	
	public Quadrado() {
		this(0, 0, 0);
	}
	
	public Quadrado(double x, double y,double lado) {
		super(x, y, lado, lado);
	}// fim do construtos
	
	public void setLado(double lado) {
		super.setDime1(lado);
	}
	
	public double getLado() {
		return super.getDime1();
	}
	
	@Override
	public double area() {
		return super.getDime1() * super.getDime1();
	}
	
	@Override
	public String toString() {
		return String.format(" Quadrado é uma %s", super.toString());
	}
}