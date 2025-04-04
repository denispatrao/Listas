package operacoesbasicas.exerciciocompras;

public class Item {

    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //construtor com todos os atributos
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //método obter nome
    public String getNome() {
        return nome;
    }

    //método obter preço
    public double getPreco() {
        return preco;
    }

    //método obter quantidade
    public int getQuantidade() {
        return quantidade;
    }
}
