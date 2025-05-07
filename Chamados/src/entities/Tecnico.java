package entities;

public class Tecnico {
    
    private String nome;
    private String funcao;
    private String matricula;

    public Tecnico(String nome,String funcao,String matricula){
        this.nome = nome;
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    

}
