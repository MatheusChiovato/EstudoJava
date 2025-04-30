package Entidades;

public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor(String nome,String cpf,double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + 500;
    }


}
