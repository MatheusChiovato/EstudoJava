package Contato;

public class Contato {
    String nome;
    String email;
    long telefone;


    public Contato() {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
}


    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public long getTelefone(){
        return telefone;
    }
    public void setTelefone(long telefone){
        this.telefone = telefone;
    }



    @Override
    public String toString(){
        return "{Nome: " + nome + ", E-mail: " + email + ", Telefone: " + telefone + "}";
    }






}
