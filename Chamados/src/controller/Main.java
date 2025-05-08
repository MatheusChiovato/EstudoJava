package controller;

import entities.*;
import controller.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Usuario user = new Usuario("Ivanilton", "12345678910","ivanivan@gmail.com");
        Chamado cmd = new Chamado(user);
        Tecnico t1 = new Tecnico("teste", "Assistente", "0001");
        SistemaChamados sistema = new SistemaChamados();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo " + user.getNome() + "!");

        boolean rodar = true;
        while (rodar) {
            System.out.println("Escolha alguma ação para realizar: ");
            System.out.println("1 - Abrir novo chamado");
            System.out.println("2 - Vincular tecnico a um chamado");
            System.out.println("3 - Listar todos os chamados");
            System.out.println("4 - Filtrar chamados");
            System.out.println("5 - Encerrar chamado");
            System.out.println("6 - Buscar chamado pelo ID");
            System.out.println("0 - Sair");
            System.out.print("R: ");

            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    sistema.adicionarChamado(user);

                    break;
                case 2:
                    sistema.vincularTecnico(t1);
                    break;
                case 3:
                    sistema.listarTodosChamados();
                    break;
                case 4:
                    sistema.filtrarChamados();
                    break;
                case 5:

                    System.out.print("Informe o id do chamado: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    sistema.encerrarChamado(id);
                    
                    break;
                case 6:
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    sistema.buscarChamado(id2);
                    break;

                case 0:
                    rodar = false;
                    break;
            
                default:
                    System.out.println("Comando invalido.");
                    break;
            }



        }


        
    }
}
