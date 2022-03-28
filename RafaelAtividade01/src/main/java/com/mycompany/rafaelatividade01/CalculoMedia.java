package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite a nota 1 do usu�rio");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2 do usu�rio");
        Double nota2 = scanner.nextDouble();

        System.out.println(String.format("Ol�, %s. Sua m�dia foi de %.1f",
                nome, (nota1 + nota2) / 2.0));
        scanner.close();
    }
}
