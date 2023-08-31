import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private static List<Tarefa> tarefaList;

    public ListaTarefas()
    {
        ListaTarefas.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    public static void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) 
        {
            for (Tarefa t : tarefaList) 
            {
                if (t.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll((tarefasParaRemover));
        }
        else 
        {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas()
    {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas()
    {
        if(!tarefaList.isEmpty())
        {
            System.out.println(tarefaList);
        } 
        else
        {
            System.out.println("A lista está vazia!");
        }
    }
    
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Estudar p/ prova");
        listaTarefa.adicionarTarefa("Treinar");
        listaTarefa.adicionarTarefa("Trabalhar");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();


    }
}
