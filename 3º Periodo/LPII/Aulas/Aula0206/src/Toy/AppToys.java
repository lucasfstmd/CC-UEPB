package Toy;
public class AppToys {
    
    public static void main(String[] args) {
        
        Toys carro = new Toys("A50", "remoto", 50);
        Control dualshok = new Control("PS5", "DualShok");

        dualshok.moveToys(carro);
        
    }
}
