package Lista06;

import java.util.HashSet;

public class quest02HashSet {
    public static void main(String[] args) {
        
        HashSet<String> listaCompras = new HashSet<String>();
    
        listaCompras.add("Cenoura");
        listaCompras.add("Macarrao");
        listaCompras.add("Refrigerante");
        listaCompras.add("Salgados");
        listaCompras.add("Laranja");
        listaCompras.add("Pasta de dentes");
        listaCompras.add("Feijao"); 
        listaCompras.add("Linguiça");

    
        for (String i: listaCompras) {
          System.out.println("== "+i);
        }
    
        listaCompras.remove("Pasta de dentes");
        listaCompras.clear();
      }

    }
    

