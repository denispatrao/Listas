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