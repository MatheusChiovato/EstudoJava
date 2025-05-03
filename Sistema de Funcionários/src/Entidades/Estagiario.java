package entidades;

import interfaces.Bonificavel;

public class Estagiario extends Funcionario implements Bonificavel{
    
    public Estagiario(String nome, String cpf, double salarioBase){
        super(nome,cpf,salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }

    @Override  
    public double calcularBonus(){
        return getSalarioBase()*0.05;
    }

}
