package Lista06;

import java.util.ArrayList;

public class quest01 {
    public static void main(String[] agrs) {
        
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("Gato", 5, "Terrestre"));
        animals.add(new Animal("Harpia", 8, "Aéreo"));

        System.out.println(animals.get(5).getNome());
        
        System.out.println(animals.get(8).getNome());
  
    }

}