package com.mycompany.atividade2;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        
     Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Digite seu Nome");
        String n1 = calculadora.nextLine();
        
        System.out.println("Informe sua 1ª nota");
        Double n2 = calculadora.nextDouble();
        
        System.out.println("Informe sua 2ª nota");
        Double n3 = calculadora.nextDouble();
        
        Double media = (n3 + n2)/2.0d; 
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", n1, media));
    }
}
