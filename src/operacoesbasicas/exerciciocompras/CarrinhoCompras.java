package operacoesbasicas.exerciciocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    //atributo lista de itens
    private List<Item> itemList;

    //construtor obtendo uma lista de itens vazia
    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    //método adicionar item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
       //criar o objeto inserindo os dados
        Item item = new Item(nome, preco, quantidade);
        //adiciono os itens com o seus dados na lista desta classe
        this.itemList.add(item);
    }

    //método para remover item com base no nome
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    /*método para calcular valor total
    inicia-se com uma variável local vazia, faz um for each varrendo
    item por item valorItem e soma a uma variável acumulativa valorTotal*/
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    //exibir itens
    public void exibirItens(){
        for (Item i : itemList) {
            System.out.println("Nome: " + i.getNome() + "- Valor R$: " + i.getPreco() + "- Quantidade : " + i.getQuantidade());
        }
    }

    //execução do programa
    public static void main(String[] args) {

        //instanciando carrinho de compras
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        //adicionando itens
        carrinhoCompras.adicionarItem("Detergente", 10.00, 2);
        carrinhoCompras.adicionarItem("Sabão", 10.00, 1);
        carrinhoCompras.adicionarItem("Bombril", 10.00, 1);
        carrinhoCompras.adicionarItem("Cloro", 10.00, 1);
        carrinhoCompras.adicionarItem("Vanish", 10.00, 1);

        //exibindo itens do carrinho
        System.out.println(" ");
        carrinhoCompras.exibirItens();

        //removendo itens do carrinho
        carrinhoCompras.removerItem("Bombril");

        //exibindo itens após remoção
        System.out.println(" ");
        System.out.println("Lista após remoção");
        carrinhoCompras.exibirItens();

        //exibindo valor total no carrinho
        System.out.println(" ");
        System.out.println("No carrinho temos: R$ " + carrinhoCompras.calcularValorTotal());
    }
}
