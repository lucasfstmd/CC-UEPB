public abstract class Forma /* extends Object *//*forma.java */ {
	
	private double x, y;
	
	public Forma() {
		
	}// fim do construtor vazio
	public Forma(double x, double y) {
		this.x = x;
		this.y = y;
	}// fim do contrutor
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return this.y;
	}
	
	public abstract double area();
	
	@Override
	public String toString() {
		return String.format("Forma, que é um %s", super.toString());
	}
	
}// fim da classe forma