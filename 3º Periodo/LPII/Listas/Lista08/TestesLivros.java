package Lista08;

import java.util.ArrayList;

public class TestesLivros {
    public static void main(String[] args) {

        ArrayList<Livros> lista = new ArrayList<Livros>(); 

        Livros livro1 = new Livros("Machado de Assis", "Quincas Borbas", Livros.generos[3], "3 Edicao ", "Leya");
        Livros livro2 = new Livros("Lima Barreto", "Os Sertões", Livros.generos[2], "5 Edicao ", "Martin-Claret");
        Livros livro3 = new Livros("G.R.R Martin", "As Cronicas do Gelo e Fogo", Livros.generos[2], "2 Edicao", "Compainha das Letras");

        lista.add(livro1);
        lista.add(livro2);
        lista.add(livro3);

        for (Livros livro : lista){
            System.out.println(livro);
        }
    }
}
