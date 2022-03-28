package com.mycompany.nivelamento4;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    Double reajustarSalario (Double porcentagem) {
        return salario*porcentagem;
    }
}
