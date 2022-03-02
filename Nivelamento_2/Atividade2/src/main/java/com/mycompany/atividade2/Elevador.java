package com.mycompany.atividade2;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Informe o limite de peso do elevador");
        Double limPeso = calculadora.nextDouble();
        
        System.out.println("Informe o limite de pessoas para ocupar o elevador");
        Integer limPessoa = calculadora.nextInt();
        
        System.out.println("Peso do 1ª pessoa a entrar no elevador");
        Double p1 = calculadora.nextDouble();
        
        System.out.println("Peso do 2ª pessoa a entrar no elevador");
        Double p2 = calculadora.nextDouble();
        
        System.out.println("Peso do 3ª pessoa a entrar no elevador");
        Double p3 = calculadora.nextDouble();
        
        Double soma = (p1 + p2 + p3);
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no "
                + "qual cabem %d pessoas.\n" +
"O peso total no elevador é de %.2f, sendo que ele suporta %.2f", limPessoa, soma, limPeso));
    }
    
}
