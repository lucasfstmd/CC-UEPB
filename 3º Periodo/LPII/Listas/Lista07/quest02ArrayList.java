package Lista06;

import java.util.ArrayList;

public class quest02ArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> listaCompras = new ArrayList<String>();
    
        listaCompras.add("Cenoura");
        listaCompras.add("Macarrao");
        listaCompras.add("Refrigerante");
        listaCompras.add("Salgados");
        listaCompras.add("Laranja");
        listaCompras.add("Pasta de dentes");
        listaCompras.add("Feijao"); 
        listaCompras.add("Linguiça");
    
        listaCompras.remove("ração");
        listaCompras.remove(0);
        
        for (String i: listaCompras) {
          System.out.println("== "+i);
        }
        
        listaCompras.clear();
      
    }
    
}
    
