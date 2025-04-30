import java.util.ArrayList;
import java.util.Scanner;

import GerenciadorTarefas.GerenciadorTarefas;
import Tarefa.Tarefa;

public class Main {
    public static void main(String[] args) throws Exception {
        
        GerenciadorTarefas ger = new GerenciadorTarefas();
        Scanner sc = new Scanner(System.in); 
        
        boolean continuar = true;

        while(continuar){
            System.out.println("----- MENU -----");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Listar tarefas concluídas");
            System.out.println("5. Listar tarefas pendentes");
            System.out.println("6. Editar tarefa");
            System.out.println("7. Remover tarefa");
            System.out.println("0. Sair");
            
            System.out.print("\nDigite um comando: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a tarefa a adicionar: ");
                    String tarf=sc.nextLine();
                    ger.adicionarTarefa(tarf);
                    break;
                case 2:
                    System.out.println("Digite uma tarefa para marcar como concluida:");
                    String tf = sc.nextLine();
                    ger.concluirTarefa(tf);
                    break;
                case 3:
                    ger.listarTarefas();
                    break;
                case 4:
                    ger.listarConlcuidas();
                    break;
                case 5:
                    ger.listarPendentes();
                    break;
                case 6:
                    System.out.print("\nDigite a tarefa a editar: ");
                    String taref = sc.nextLine();
                    System.out.print("\nDigite a tarefa a editar: ");
                    String novo = sc.nextLine();
                    ger.editarTarefa(taref,novo);
                    break;
                case 7:
                    System.out.println("Digite a tarefa a remover: ");
                    String tar = sc.nextLine();
                    ger.removerTarefa(tar);
                    break;

                case 0:
                    System.out.println("Saindo ...");
                    continuar = false;
            
                default:
                    System.out.println("Comando inválido!\n");
                    break;
            }

        }
           
    }
       
}
