# Explicando Exercício

## Lista de Tarefas

Crie uma classe chamada "operacoesbasicas.exerciciotarefas.ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "operacoesbasicas.exerciciotarefas.Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

>- adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
>- removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
>- obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
>- obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.

### A classe operacoesbasicas.exerciciotarefas.Tarefa:

    public class operacoesbasicas.exerciciotarefas.Tarefa {

        private String descricao;

        public operacoesbasicas.exerciciotarefas.Tarefa(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }
---
### A classe comentada

criando a classe operacoesbasicas.exerciciotarefas.Tarefa

    public class operacoesbasicas.exerciciotarefas.Tarefa {

seu atributo
       
        private String descricao;

construtor

        public operacoesbasicas.exerciciotarefas.Tarefa(String descricao) {
            this.descricao = descricao;
        }

método get para obter a descrição

        public String getDescricao() {
            return descricao;
        }
    }

---

---
### A Classe operacoesbasicas.exerciciotarefas.ListaTarefas
    import java.util.ArrayList;
    import java.util.List;

    public class operacoesbasicas.exerciciotarefas.ListaTarefas {

        private List<operacoesbasicas.exerciciotarefas.Tarefa> tarefaList;

        public operacoesbasicas.exerciciotarefas.ListaTarefas() {
            this.tarefaList = new ArrayList<>();
        }

        //adicionar tarefa
        public void adicionarTarefa(String descricao){
            tarefaList.add(new operacoesbasicas.exerciciotarefas.Tarefa(descricao));
        }

        //remover tarefa
        public void removerTarefa(String descricao){
            List<operacoesbasicas.exerciciotarefas.Tarefa> remover = new ArrayList<>();
            for (operacoesbasicas.exerciciotarefas.Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    remover.add(t);
                }
            }
            tarefaList.removeAll(remover);
        }

        //obtendo numero total das tarefas
        public void obterNumeroTotalTarefas(){
            System.out.println("O número total de tarefa é: " + tarefaList.size());
        }

        //obtendo descrição das tarefas
        public void obterDescricoesTarefas(){
            for (operacoesbasicas.exerciciotarefas.Tarefa t : tarefaList){
                System.out.println(t.getDescricao());
            }
        }

        public static void main(String[] args) {

            operacoesbasicas.exerciciotarefas.ListaTarefas tarefas = new operacoesbasicas.exerciciotarefas.ListaTarefas();

            tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 1");
            tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 2");
            tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 3");
            tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 4");
            tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 5");

            System.out.println(" ");
            System.out.println("Mostrando todas as tarefas");
            tarefas.obterDescricoesTarefas();

            System.out.println(" ");
            System.out.println("Mostrando quantidade de tarefas da lista");
            tarefas.obterNumeroTotalTarefas();

            System.out.println(" ");
            System.out.println("Removendo tarefa");
            tarefas.removerTarefa("operacoesbasicas.exerciciotarefas.Tarefa 4");

            System.out.println(" ");
            System.out.println("Atualizando lista de tarefas");
            tarefas.obterDescricoesTarefas();
            tarefas.obterNumeroTotalTarefas();
        }

    }
---

---
### A classe comentada

os imports necessários

    import java.util.ArrayList;
    import java.util.List;

criando a classe operacoesbasicas.exerciciotarefas.ListaTarefas

        public class operacoesbasicas.exerciciotarefas.ListaTarefas {

atributo lista de Tarefas sem receber valores para iniciar como lista vazia no seu construtor

            private List<operacoesbasicas.exerciciotarefas.Tarefa> tarefaList;

construtor recebendo uma lista vazia isso é necessário porque sempre que eu quiser criar um objeto ListaTarefa eu terei automaticamente um atributo tarefaList com um ArrayList vazio esperando o que eu desejo fazer.

            public operacoesbasicas.exerciciotarefas.ListaTarefas() {
                this.tarefaList = new ArrayList<>();
            }

método para adicionar tarefa - recebemos a descrição como parametro e acrescentamos a lista

            public void adicionarTarefa(String descricao){
                tarefaList.add(new operacoesbasicas.exerciciotarefas.Tarefa(descricao));
            }

método para remover a tarefa - recebemos a descrição a ser removida como parametro. Cria-se uma nova lista vazia com o nome remover, dentro dela iremos adicionar as tarefas que queremos remover recebida na descrição em parametro. Cria-se um laço de repetição para pegar cata t dentro da lista tarefaList e faz a condição se a descrição da tarefa (t) é igual a descrição que eu passei no parametro eu pego o remover e adiciono a tarefa. Ao final efetua a remoção da lista a ser removida que conterá a descrição do que se pediu no parametro. 
           
            public void removerTarefa(String descricao){
                List<operacoesbasicas.exerciciotarefas.Tarefa> remover = new ArrayList<>();
                for (operacoesbasicas.exerciciotarefas.Tarefa t : tarefaList){
                    if (t.getDescricao().equalsIgnoreCase(descricao)){
                        remover.add(t);
                    }
                }
                tarefaList.removeAll(remover);
            }

método obter numero total de tarefas que nada mais é que imprimir o tamanho da lista

            public void obterNumeroTotalTarefas(){
                System.out.println("O número total de tarefa é: " + tarefaList.size());
            }

método para obeter a descrição das tarefas percorre toda a lista e imprime o seu conteúdo

            public void obterDescricoesTarefas(){
                for (operacoesbasicas.exerciciotarefas.Tarefa t : tarefaList){
                    System.out.println(t.getDescricao());
                }
            }

Execução do programa

            public static void main(String[] args) {

criando o atributo lista de tarefas

                operacoesbasicas.exerciciotarefas.ListaTarefas tarefas = new operacoesbasicas.exerciciotarefas.ListaTarefas();

adicionando as tarefas

                tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 1");
                tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 2");
                tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 3");
                tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 4");
                tarefas.adicionarTarefa("operacoesbasicas.exerciciotarefas.Tarefa 5");

imprimindo todas as tarefas

                System.out.println(" ");
                System.out.println("Mostrando todas as tarefas");
                tarefas.obterDescricoesTarefas();

imprimindo a quantidade de tarefas

                System.out.println(" ");
                System.out.println("Mostrando quantidade de tarefas da lista");
                tarefas.obterNumeroTotalTarefas();

removendo a tarefa escolhida

                System.out.println(" ");
                System.out.println("Removendo tarefa");
                tarefas.removerTarefa("operacoesbasicas.exerciciotarefas.Tarefa 4");

imprimindo a lista de tarefa atualizada

                System.out.println(" ");
                System.out.println("Atualizando lista de tarefas");
                tarefas.obterDescricoesTarefas();
                tarefas.obterNumeroTotalTarefas();
            }

        }

# A Saída:
    Mostrando todas as tarefas
    Tarefa 1
    Tarefa 2
    Tarefa 3
    Tarefa 4
    Tarefa 5

    Mostrando quantidade de tarefas da lista
    O número total de tarefa é: 5

    Removendo tarefa

    Atualizando lista de tarefas
    Tarefa 1
    Tarefa 2
    Tarefa 3
    Tarefa 5
    O número total de tarefa é: 4
