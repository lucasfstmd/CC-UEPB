package Lista08;

public class Livros {
    public String autor;
    public String titulo;
    public static String[] generos = new String[] {"ciências naturais", "ficção", "ciências humanas", "literatura"};
    public static String genero;
    public String edicao;
    public String editor;

    public Livros(String autor, String titulo, String genero, String edicao, String editor) {
        this.autor = autor;
        this.titulo = titulo;
        Livros.genero = genero;
        this.edicao = edicao;
        this.editor = editor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static String[] getGeneros() {
        return generos;
    }

    public static void setGeneros(String[] generos) {
        Livros.generos = generos;
    }

    public static String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        Livros.genero = genero;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Livros [autor = " + autor + ", gênero = " + genero + ", editora = " + editora + ", edição = " + edição + ", titulo = " + titulo + "]";
    }
}
