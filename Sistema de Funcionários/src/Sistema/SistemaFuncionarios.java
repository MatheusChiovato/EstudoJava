package sistema;

import java.util.*;

import entidades.*;
import interfaces.*;

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

    public double calcularTotalBonus(List<Bonificavel> bonificaveis){
        double total=0;
        for (Funcionario f : funcionarios) {
            if (f instanceof Bonificavel) {
                Bonificavel b = (Bonificavel) f;
                total += b.calcularBonus();
            }
        }
        return total;
    }



}