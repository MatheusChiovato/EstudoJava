package Entidades;

public class Estagiario extends Funcionario {
    
    public Estagiario(String nome, String cpf, double salarioBase){
        super(nome,cpf,salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }


}
