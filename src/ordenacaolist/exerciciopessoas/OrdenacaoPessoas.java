package ordenacaolist.exerciciopessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //método para adicionar pessoa
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //método para ordenar por idade - eu crio uma classe privada do tipo List<Pessoa>
    //criamos uma lista de pessoas para poder duplicarmos essa lista sendo assim tudo que está na lista pessoaList
    // vai para a lista pessoasPorIdade, até esse momento a lista não está ordenada ainda, então tenho que passar
    // o Collections com o método sort para ordenar agora sim eu tenho que retornar a lista pessoaPorIdade ordenada.
    private List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //método para ordenar por altura - eu crio uma classe privada do tipo List<Pessoa>
    //criamos uma lista de pessoas para poder duplicarmos essa lista sendo assim tudo que está na lista pessoaList
    // vai para a lista pessoasPorAltura, até esse momento a lista não está ordenada ainda, então tenho que passar
    // o Collections com o método sort e nele comparar a lista pessoasPoraltura com a isntanciação de
    //  Pessoa.ComparatorPorAltura para ordenar agora sim eu tenho que retornar a lista pessoaPorAltura ordenada.
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Denis", 49, 1.65);
        ordenacaoPessoas.adicionarPessoa("Mario", 48, 1.85);
        ordenacaoPessoas.adicionarPessoa("Pedro", 23, 1.45);

        System.out.println(" ");
        System.out.println("LISTA DE PESSOAS");
        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println(" ");
        System.out.println("ORDEM POR IDADE");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(" ");
        System.out.println("ORDEM POR ALTURA");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
