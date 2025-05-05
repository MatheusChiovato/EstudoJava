package entidades;

import excecoes.CpfInvalidoException;

public abstract class Funcionario{
    private String nome;
    private String cpf;
    private double salarioBase;


    public Funcionario(String nome, String cpf, double salarioBase) throws CpfInvalidoException{
        if(cpf == null || cpf.trim().isEmpty()){
            throw new CpfInvalidoException("CPF nao pode ser vazio");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();


}