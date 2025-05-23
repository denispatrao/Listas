package ordenacaolist.exerciciopessoas;

import java.util.Comparator;

//tenho que implementar o comparabel genercis "Pessoa" pra poder sobrescrever um método compareTo
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    /*método compareTo da implementação de Comparable
    para manipular o inteiro eu tenho que usar a classe Wrap no caso
    Integer e detro dela teremos um método chamado compare em seu parametro eu vou pegar
    o atributo idade desta classe e vou comparar com a idade que nós passarmos no p*/
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "{" +
                "Nome: " + nome +
                " - Idade: " + idade +
                " - Altura: " + altura +
                '}' + "\n";
    }

    //para usar o Comparator eu tenho que criar a classe
    static class ComparatorPorAltura implements Comparator<Pessoa>{

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(),p2.getAltura());
        }
    }

}
