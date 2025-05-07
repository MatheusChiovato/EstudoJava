package controller;

import entities.*;
import java.util.*;

public class SistemaChamados {
    
    ArrayList<Chamado> chamados = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void adicionarChamado(Usuario user){

        Chamado chamado = new Chamado(user);
        Date data = new Date();

        System.out.println("Qual o problema a relatar:\n");
        String titulo = sc.nextLine();
        chamado.setTitulo(titulo);

        System.out.println("Explique o problema:\n");
        String descricao = sc.nextLine();
        chamado.setDescricao(descricao);

        chamado.setStatus("Aberto");
        chamado.setDataDeAbertura(data);

        System.out.println("Qual a prioridade do chamado:");
        System.out.println("1 - Urgente");
        System.out.println("2 - Alta");
        System.out.println("3 - Normal\n");

        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                chamado.setPrioridade("Urgente");
                break;
            case 2:
                chamado.setPrioridade("Alta");
                break;
            case 3:
                chamado.setPrioridade("Normal");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        System.out.println("Chamado aberto!\n");

        chamados.add(chamado);
    }

    public void vincularTecnico(Tecnico tecnico, int id){
        
        for(Chamado c : chamados){
            if(c.getId() == id){
                c.setTecnicoResponsavel(tecnico);
                c.setStatus("Em tratativa");
                System.out.println("Tecnico " + tecnico.getNome() + " vinculado ao chamado #" + c.getId());
                break;
            }
        }
    }


    public void listarTodosChamados(){
        
        for(Chamado c : chamados){
            exibirChamado(c);
        }

    }


    public void filtrarChamados(){

        System.out.println("Filtrar chamados por: ");
        System.out.println("1 - Status");
        System.out.println("2 - Prioridade");


        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.print("\nDigite o status desejado: ");
                String status = sc.nextLine();
                filtrarStatus(status);
                break;

            case 2:
                
                System.out.print("\nDigite a prioridade desejada: ");
                String prioridade = sc.nextLine();
                filtrarPrioridade(prioridade);
                break;

            default:
                System.out.println("Opção invalida!");
                filtrarChamados();
                break;
        }
    }

    private void filtrarStatus(String status){
        for(Chamado c : chamados){
            if(c.getStatus().toLowerCase().contains(status)){
               exibirChamado(c);
            }
        }
    }
    
    private void filtrarPrioridade(String prioridade){
        for(Chamado c : chamados){
            if(c.getPrioridade().toLowerCase().contains(prioridade)){
                exibirChamado(c);
            }
        }
    }

    private void exibirChamado(Chamado c){
        System.out.print("\n");
                System.out.println("Chamado #" + c.getId());
                System.out.println(c.getTitulo().toUpperCase());
                System.out.println(c.getDescricao());
                System.out.println("--------------------");
                System.out.println(c.getPrioridade().toLowerCase());
                System.out.println(c.getStatus().toUpperCase());
                if(c.getTecnicoResponsavel() != null){
                    System.out.println("Responsável: " + c.getTecnicoResponsavel());
                }else{
                    System.out.println("Nenhum responsável vinculado para tratativa.");
                }
    }


    public void encerrarChamado(int id){
        boolean encontrado = false;
        for(Chamado c : chamados){
            if(c.getId() == id){
                Date data = new Date();
                c.setStatus("Finalizado");
                c.setDataDeFechamento(data);
                System.out.println("Chamado #" + c.getId() + " foi finalizado!");
                break;
            }
            if(!encontrado){
                System.out.println("Chamado nao encontrado!");
            }
        }
    }


    public void buscarChamado(int id){
        for(Chamado c : chamados){
            if(c.getId() == id){
                exibirChamado(c);
            }
        }
    }


}