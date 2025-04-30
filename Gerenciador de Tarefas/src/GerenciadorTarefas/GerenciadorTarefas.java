package GerenciadorTarefas;

import java.util.ArrayList;
import java.util.Arrays;

import Tarefa.Tarefa;

public class GerenciadorTarefas {

   private ArrayList<Tarefa> tarefas = new ArrayList<>();


    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);
        tarefa.setStatus(false);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!\n");
    }

    public void listarTarefas(){
        if(tarefas.size()>0){
            
            for(int i=0;i<tarefas.size();i++){

                String status;
                if(tarefas.get(i).getStatus()){
                    status = "Concluído";
                }else{
                    status = "Pendente";
                }

                System.out.println("Tarefa: " + tarefas.get(i).getDescricao() + " - " + status);           
            }
        }else{
                System.out.println("Nenhuma tarefa listada!\n");
        }
    }


    public void concluirTarefa(String descricao){
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
                System.out.println("Tarefa " + t.getDescricao() + " concluída\n");
                break;
            }
        }
    }

    public void removerTarefa(String descricao){
    
        for(int i=0;i<tarefas.size();i++){
            if(descricao.equalsIgnoreCase(tarefas.get(i).getDescricao())){
                tarefas.remove(i);
                System.out.println("Tarefa removida com sucesso!");
                break;
            }
        }

    }

    public void listarConlcuidas(){
        System.out.println("Tarefa ----- Status");
        for(Tarefa t : tarefas){
            boolean encontrou = false;
            if(t.getStatus()){
                System.out.println(t.getDescricao() + "  " + t.getStatus());
                encontrou = true;
            }
            if(!encontrou){
                System.out.println("Nenhuma tarefa concluída!\n");
            }
        }
    }

    public void listarPendentes(){
        System.out.println("Tarefa ----- Status");
        for(Tarefa t : tarefas){
            boolean encontrou = false;
            if(!t.getStatus()){
                System.out.println(t.getDescricao() + "  " + t.getStatus());
                encontrou = true;
            }
            if(!encontrou){
                System.out.println("Nenhuma tarefa pendente!\n");
            }
            
        }
    }

    public void editarTarefa(String taref,String novo){
        for(Tarefa t : tarefas){
            if (t.getDescricao().equalsIgnoreCase(taref)) {
                t.setDescricao(novo);
                System.out.println("Tarefa editada com sucesso!\n");
                break;
            }
        }
    }
}