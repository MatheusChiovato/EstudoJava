package Agenda;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Contato.Contato;



public class Agenda {
     
    private List<Contato> contatos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    public void adicionarContato(Contato contato){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        contato.setName(nome);
        System.out.println("Digite um E-mail: ");
        String email=sc.nextLine();
        contato.setEmail(email);
        System.out.println("Digite um Telefone: ");
        long telefone = sc.nextLong();
        contato.setTelefone(telefone);
        contatos.add(contato);
    }

    public void listarContatos(){

        int num = 1;

        for(Contato c : contatos){
            System.out.println("Contato " + num);
            System.out.println("Nome: " + c.getName());
            System.out.println("E-mail: " + c.getEmail());
            System.out.println("Telefone: " + c.getTelefone());
            num++;
        }
    }

    public void buscarContato(String nome){
        for(Contato c : contatos){
            if (nome.contains(c.getName())){
                System.out.println(c.getName() + ":");
                System.out.println("E-mail: " + c.getEmail());
                System.out.println("Telefone: " + c.getTelefone());
                }
            }
        }

        public void removerContato(String nome){
            
            for(int i=0; i < contatos.size(); i++){
                if(nome.equalsIgnoreCase(contatos.get(i).getName())){
                    contatos.remove(i);
                    break;
                }
            }
        }

        
}