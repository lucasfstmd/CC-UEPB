abstract public class Cubo extends Tridimensional{
    private double lado;
    
    /*public Cubo(){
        
    }*/
    
    public Cubo(double x, double y, double lado){
        super(x, y, lado, lado, lado);
        
    }
    public void setLado(double lado){
        super.setDimensao1(lado);
    }
    
    public double getLado(){
        return super.getDimensao1();
    }

    @Override
    public double area(){
        return 6D * super.getDimensao1() * getDimensao1();
    }

    //@Override
    public double volume(){
        return Math.pow(super.getDimensao1(), 3);
    }

    @Override
    public String toString(){
        return String.format("Cubo que é uma forma %s", super.toString());
    }
}
