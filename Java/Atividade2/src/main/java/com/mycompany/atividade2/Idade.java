package com.mycompany.atividade2;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Digite seu Nome");
        String n1 = calculadora.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", n1));
        Integer n2 = calculadora.nextInt();
        
        Integer total = (2022-n2)+8;
        
        System.out.println(String.format("Em 2030 você terá %d anos.", total));
    }
    
}
