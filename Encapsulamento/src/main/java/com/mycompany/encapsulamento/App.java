package com.mycompany.encapsulamento;

public class App {

    public static void main(String[] args) {
        Aluno rafaLindo = new Aluno();
        
        rafaLindo.setRa("01212195");        
        rafaLindo.setNome("Amorzinho");
        rafaLindo.setCurso("Gambiarra");
        rafaLindo.setNota1(10.0);
        rafaLindo.setNota2(9.0);
        System.out.println(rafaLindo);
        
    }
}
