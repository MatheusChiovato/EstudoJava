package entities;

import java.util.*;

public class Chamado {
    
    private int id;
    private static int contatorId = 0;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status status;
    private Date dataDeAbertura;
    private Date dataDeFechamento;
    private Usuario usuario;
    private Tecnico tecnicoResponsavel;
    public Chamado(Usuario usuario) {
        this.id = contatorId++; 
        this.usuario = usuario;
    }

    public int getId(){
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Prioridade getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    public Date getDataDeFechamento() {
        return dataDeFechamento;
    }
    public void setDataDeFechamento(Date dataDeFechamento) {
        this.dataDeFechamento = dataDeFechamento;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }
    public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    

}
