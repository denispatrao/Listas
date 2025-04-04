package operacoesbasicas.exerciciotarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //remover tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> remover = new ArrayList<>();
        for (Tarefa t : tarefaList){
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
        for (Tarefa t : tarefaList){
            System.out.println(t.getDescricao());
        }
    }

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");
        tarefas.adicionarTarefa("Tarefa 4");
        tarefas.adicionarTarefa("Tarefa 5");

        System.out.println(" ");
        System.out.println("Mostrando todas as tarefas");
        tarefas.obterDescricoesTarefas();

        System.out.println(" ");
        System.out.println("Mostrando quantidade de tarefas da lista");
        tarefas.obterNumeroTotalTarefas();

        System.out.println(" ");
        System.out.println("Removendo tarefa");
        tarefas.removerTarefa("Tarefa 4");

        System.out.println(" ");
        System.out.println("Atualizando lista de tarefas");
        tarefas.obterDescricoesTarefas();
        tarefas.obterNumeroTotalTarefas();

    }

}
