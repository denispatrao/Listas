package pesquisalist.somadenumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    //método para adicionar numeros
    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    //método para somar os numeros
    public int somarNumeros(){
        int soma = 0;
        for (Integer i : integerList){
            soma += i;
        }
        return soma;
    }

    //método para encontrar maior numero
    public int maiorNumero(){
        int maior = 0;
        for (Integer i : integerList){
            if (i >= maior){
                maior = i;
            }
        }
        return maior;
    }

    //método para encontrar menor numero
    public int menorNumero(){
        int menor = maiorNumero();
        for (Integer i : integerList){
            if (i <= menor){
                menor = i;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println(" ");
        System.out.println("NUMEROS DA LISTA");
        System.out.println(somaNumeros.integerList);

        System.out.println(" ");
        System.out.println("A soma dos numeros é: " + somaNumeros.somarNumeros());

        System.out.println(" ");
        System.out.println("O maior numero é: " + somaNumeros.maiorNumero());

        System.out.println(" ");
        System.out.println("O maior numero é: " + somaNumeros.menorNumero());
    }
}
