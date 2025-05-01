package Sistema;

import Entidades.*;

public class Main {
    public static void main(String[] args) throws Exception {

        SistemaFuncionarios sistema = new SistemaFuncionarios();

        Funcionario f1 = new Gerente("Pedro", "21375648239", 12000.00);
        Funcionario f2 = new Desenvolvedor("Camila", "43475648123", 5000.00);
        Funcionario f3 = new Estagiario("Matias", "834373218239", 1000.00);
        
        sistema.adicionarFuncionario(f1);
        sistema.adicionarFuncionario(f2);
        sistema.adicionarFuncionario(f3);

        System.out.println();
        sistema.listarFuncionarios();
        System.out.println("\nFolha total - R$" + sistema.calcularFolhaTotal());

    }
}
