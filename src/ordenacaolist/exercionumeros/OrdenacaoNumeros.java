package ordenacaolist.exercionumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.integerList);
        for (Integer i : integerList){
            Collections.sort(numerosAscendente);
        }
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendentes() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.integerList);
        for (Integer i : integerList){
            numerosDescendentes.sort(Collections.reverseOrder());
        }
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        System.out.println(" ");
        System.out.println("Lista de Números");
        System.out.println(ordenacaoNumeros.integerList);

        System.out.println(" ");
        System.out.println("Números Ascendentes");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(" ");
        System.out.println("Números Descendentes");
        System.out.println(ordenacaoNumeros.ordenarDescendentes());

    }
}
