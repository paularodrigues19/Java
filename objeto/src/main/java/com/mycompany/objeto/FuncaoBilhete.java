package com.mycompany.objeto;

import java.util.Scanner;

public class FuncaoBilhete {

    Scanner digitar = new Scanner(System.in);
            
    Double saldo;
    Integer tipo;
    String nome;    
    String cpf;
    String transporte;

    Boolean bilhete;
    
    Boolean debitar (Double valorBilhete) {
        valorBilhete-=saldo;
        return true;
    };
    Boolean creditar (Double valorBilhete) {
        valorBilhete+=saldo;
        return true;
    };
    void validarCpf () {
        if (cpf.length() != 11) {
            System.out.println("Digite um valor de CPF válido");
            cpf = digitar.next();
        }
    }
}
