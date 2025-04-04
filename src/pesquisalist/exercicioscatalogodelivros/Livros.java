package pesquisalist.exercicioscatalogodelivros;

public class Livros {

    //atributos
    private String titulo;
    private String autor;
    private int ano;

    //construtor
    public Livros(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //método para obter titulo
    public String getTitulo() {
        return titulo;
    }

    //método para obter autor
    public String getAutor() {
        return autor;
    }

    //método para obter ano
    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo = '" + titulo + '\'' +
                " autor = '" + autor + '\'' +
                " ano = " + ano +
                '}' + "\n";
    }
}
