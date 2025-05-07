package controller;

import entities.*;
import controller.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Usuario user = new Usuario("Ivanilton", "12345678910","ivanivan@gmail.com");
        Chamado cmd = new Chamado(user);
        Tecnico t1 = new Tecnico("teste", "Assistente", "0001");
        
        SistemaChamados sistema = new SistemaChamados();


    }
}
