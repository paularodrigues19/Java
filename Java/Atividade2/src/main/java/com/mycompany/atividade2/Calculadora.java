package com.mycompany.atividade2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Double n1 = calculadora.nextDouble();
        
        System.out.println("Dígite outro número");
        Double n2 = calculadora.nextDouble();
        
        Double soma = n1 + n2; 
        Double  divisao = n1 / n2; 
        Double multiplicacao= n1 * n2; 
        Double subtracao = n1 - n2; 
        
        System.out.println(String.format("Resultado da Soma %.2f", soma));         
        System.out.println(String.format("Resultado da Divisão %.2f", divisao));
        System.out.println(String.format("Resultado da Multiplicação %.2f", multiplicacao));
        System.out.println(String.format("Resultado da Subtração %.2f", subtracao));

    }
}
