import Contato.Contato;
import Agenda.Agenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        
        while(continuar){
            System.out.println("--- MENU ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println();
                    Contato novoContato = new Contato();
                    agenda.adicionarContato(novoContato);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println();
                    agenda.listarContatos();
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println();
                    System.out.print("Digite um nome para buscar: ");
                    String nomeBusca = sc.nextLine();
                    agenda.buscarContato(nomeBusca);
                    System.out.println();
                    break;
                
                case 4:
                    System.out.println();
                    System.out.println("Digite um nome para remover: ");
                    String nmBusca = sc.nextLine();
                    agenda.removerContato(nmBusca);
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Opção inválida");
            }        
        }

        sc.close();
    }
}
