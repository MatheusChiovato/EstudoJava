package Sistema;

import java.util.*;

import Entidades.Desenvolvedor;
import Entidades.Estagiario;
import Entidades.Funcionario;
import Entidades.Gerente;

public class SistemaFuncionarios {
    
    List<Funcionario> funcionarios = new ArrayList<>();

    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        String cargo = "";
        for(Funcionario f : funcionarios){
            if(f instanceof Gerente)  cargo = "Gerente";
            else if(f instanceof Desenvolvedor) cargo = "Desenvolvedor";
            else if(f instanceof Estagiario) cargo = "Estagiário"; 
            System.out.println("Nome: " + f.getNome() + " | Cargo: " + cargo + " | Salario calculado - R$" + f.calcularSalario());
        }
    }

    public void buscarFuncionario(String cpf){
        for(Funcionario f : funcionarios){
            if(f.getCpf().equals(cpf)){
                System.out.println("Nome: " + f.getNome());
                break;
            }
        }
    }

    public double calcularFolhaTotal(){
         double salarioTotal = 0;

        for(Funcionario f : funcionarios){
            salarioTotal += f.calcularSalario();
        }
        return salarioTotal;
    }

 

}