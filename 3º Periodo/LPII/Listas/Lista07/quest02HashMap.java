package Lista06;

import java.util.HashMap;

public class quest02HashMap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> listaCompras = new HashMap<Integer, String>();
        
        listaCompras.put("Cenoura");
        listaCompras.put("Macarrao");
        listaCompras.put("Refrigerante");
        listaCompras.put("Salgados");
        listaCompras.put("Laranja");
        listaCompras.put("Pasta de dentes");
        listaCompras.put("Feijao"); 
        listaCompras.put("Linguiça");
      
        for (String i: listaCompras.values()) {
          System.out.println("== "+i);
        }
      
        listaCompras.remove(3);
        
        listaCompras.clear();
      
    }
    
}
