# Collections

### Considerações iniciais
Collections são estruturas de dados que agrupam elementos (Objetos) em uma única unidade. Podem ser homogêneas e heterogêneas.
Possuem interfaces que permitem manipulação:
>- ### List (lista)
>- ### Set (conjunto)
>- ### Queue (fila)
>- ### Map (mapa)

Cada inteface possui classes para manipulação. Todas essas classes e interfaces estão no pacote (package) java.util.

# List

Coleção ordenada que permite inclusão de elementos duplicados.

Suas classes de implementação são ArrayList e LinkedList.

Manipulamos o List usando a classe Collections que possui métodos: ordenação (sort), embaralhamento (shufle), reversão (reverse) e busca binária (binarySearch).

Na List os elementos vão sendo armazenado de acordo com a sequência em que são adicionados, ou seja, da forma que forem colocados dentro a lista é desta forma que irão permanecer. Obs.: se quiser embaralhar, colocar na ordem alfabética, aí faremos uso do Comparable ou Comparator.

# Tipos Genéricos (Generics Type)

Generics é uma classe ou interface parametrizada em relação a tipos. Usamos o simbolo <> onde em seu interior colocamos o tipo. Exemplo de uma classe comum:

---

    public class box {

        private Object object;

        public void set(Object object){
            this.object = object;
        }

        public Object get(){
            return object;
        }
    }

---

Abaixo exemplo da mesma classe porém com o uso de generics:

---
    public class box<T> {

        private T t;

        public void set(T t){
            this.t = t;
        }

        public T get(){
            return t;
        }
    }
---
Nota-se que, tudo o que era Object foi substituído por T

>- E - Elemento.
>- K - Chave.
>- N - Número.
>- T - Tipo.
>- V - Valor.
>- ...

Obs.: os tipos não podem ser tipo primitivo.

# Comparable X Comparator

São interfaces.

## Comparable:

Ordena uma coleção com base em um único elemento: id, nome e preço. Como colcocar uma lista em ordem alfabética, por exemplo.

O comparable deve ser usado na classe onde quero fazer essa ordenação. Ele está localizado no pacote java.lang.

Possui o método CompareTo() para fazer essa ordenação.

Podemos usar para ordenação do tipo Comparable usando o método Collections.sort(List).

## Comparator:

Possui o método compare() para ordenar elementos. Ordena com multiplas sequências, ou seja, em multiplos elementos, como: id, nome, preço.

O Comparator está localizado no pacote java.util. Ele não é usado na classe onde quero a ordenação, usa o método Collections.sort(List, Comparator).

## Collections:

Classe utilitária para operações comuns em coleções.

Fornece métodos de ordenação, busca, manipulação e sincronização de coleções.

O método sort() é usado para ordenar uma lista de forma ascendente. Quando usado com o método Colletction.reverseOrder, ja faz de forma descendente.