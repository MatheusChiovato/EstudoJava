package entidades;

import interfaces.Bonificavel;

public class Desenvolvedor extends Funcionario implements Bonificavel {
    
    public Desenvolvedor(String nome,String cpf,double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + 500;
    }

    @Override  
    public double calcularBonus(){
        return getSalarioBase()*0.10;
    }


}
