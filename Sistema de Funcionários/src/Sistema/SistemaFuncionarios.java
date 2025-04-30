package Sistema;

import java.util.*;

import Entidades.Funcionario;

public class SistemaFuncionarios {
    
    List<Funcionario> funcionarios = new ArrayList<>();
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        for(Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome() + " | " + "Salario: " + f.getSalarioBase());
        }
    }


}
