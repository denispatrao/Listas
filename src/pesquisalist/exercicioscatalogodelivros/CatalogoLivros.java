package pesquisalist.exercicioscatalogodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo lista de livros
    private List<Livros> listaDeLivros;

    //construtor da lista de livros porém vazia
    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }

    //método para adicionar livros na lista
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livros(titulo, autor, anoPublicacao));
    }

    /*método para pesquisar livros - este método tem que retornar um valor que, no caso, do tipo lista de livros
    recebendo como parametro o autor. Nele criamos uma nova lista (livroPorAutor) que irá receber os autores
    desejados na busca, percorrendo cada elemento Livro contido na listaDeLivros*/
    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livroPorAutor = new ArrayList<>();
        for (Livros l : listaDeLivros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livroPorAutor.add(l);
            }
        }
        return livroPorAutor;
    }

    /*método para pesquisar por intevalo - este método tem que retornar um valor que, no caso, do tipo lista de livros
    recebendo como parametro dois atributos. Nele criamos uma nova lista (livroPorIntervalo) que irá receber os intervalos
    entre os atributos ano inicial e ano final incluido na busca, percorrendo cada elemento Livro contido na listaDeLivros*/
    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosPorIntervalo = new ArrayList<>();
        for (Livros l : listaDeLivros) {
            if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }
    /*método para pesquisar por titulo - este método tem que retornar um valor que, no caso, do tipo livros
    recebendo como parametro o titulo. Nele criamos uma nova lista (livroPorTitulo) que irá receber os títulos
    desejados na busca, percorrendo cada elemento Livro contino na listaDeLivros*/
    public Livros pesquisarPorTitulo(String titulo) {
        Livros livroPorTitulo = null;
        for (Livros l : listaDeLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("1", "1", 2020);
        catalogoLivros.adicionarLivro("2", "2", 2021);
        catalogoLivros.adicionarLivro("3", "3", 2022);
        catalogoLivros.adicionarLivro("4", "4", 2023);
        catalogoLivros.adicionarLivro("5", "5", 2024);

        //Exibindo todos os livros
        System.out.println(" ");
        System.out.println("Todos os livros da lista");
        System.out.println(catalogoLivros.listaDeLivros);

        // Exibindo livros pelo mesmo autor
        System.out.println(" ");
        System.out.println("Livros por autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("1"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(" ");
        System.out.println("Livros por ano");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros por título
        System.out.println(" ");
        System.out.println("Livros por título");
        System.out.println(catalogoLivros.pesquisarPorTitulo("3"));

    }
}
