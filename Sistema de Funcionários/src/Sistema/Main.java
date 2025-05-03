package sistema;

import java.util.*;

import entidades.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) throws Exception {

        SistemaFuncionarios sistema = new SistemaFuncionarios();

        Bonificavel gerente = new Gerente("Pedro", "21375648239", 12000.00);
        Bonificavel desenvolvedor = new Desenvolvedor("Camila", "43475648123", 5000.00);
        Bonificavel estagiario = new Estagiario("Matias", "834373218239", 1000.00);
        
        


        List<Bonificavel> bonificaveis = new ArrayList<>();
        bonificaveis.add(gerente);
        bonificaveis.add(desenvolvedor);
        bonificaveis.add(estagiario);



        System.out.println();
        sistema.listarFuncionarios();
        System.out.println("\nTotal de bonus - R$" + sistema.calcularTotalBonus(bonificaveis));

    }
}
