package entidades;

import interfaces.Bonificavel;

public class Gerente extends Funcionario implements Bonificavel {
    
    public Gerente(String nome,String cpf,double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + 1000;
    }

    @Override
    public double calcularBonus(){
        return getSalarioBase()*0.20;
    }

}