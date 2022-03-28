package com.mycompany.objeto;

public class ContaCorrente {
    
    // Declarando características da classe
    // Atributos
    
    
    String nome;
    
    Double saldo;
    
    // Declarando os COMPORTAMENTOS
    //comportamentos são chamados de  MÉTODOS
    void sacar(Double money) {
        if( saldo < money) {
            System.out.println("Você é pobre");
        } else {
            saldo-=money;
        }
    }
    
    void depositar(Double money) {
        saldo+=money;

    } 
    
    
}

