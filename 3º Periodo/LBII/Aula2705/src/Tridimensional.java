
public class Tridimensional extends Forma{
    private double dimensao1, dimensao2, dimensao3;


    public Tridimensional(double x, double y, double dimensao1, double dimensao2, double dimensao3) {
        super(x, y);
        this.dimensao1 = dimensao1;
        this.dimensao2 = dimensao2;
        this.dimensao3 = dimensao3;
    }

    public double getDimensao1() {
        return dimensao1;
    }

    public void setDimensao1(double dimensao1) {
        this.dimensao1 = dimensao1;
    }

    public double getDimensao2() {
        return dimensao2;
    }

    public void setDimensao2(double dimensao2) {
        this.dimensao2 = dimensao2;
    }

    public double getDimensao3() {
        return dimensao3;
    }

    public void setDimensao3(double dimensao3) {
        this.dimensao3 = dimensao3;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString(){
        return String.format("Tridimensional que é uma %s", super.toString());
    }
};