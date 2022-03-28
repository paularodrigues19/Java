package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�ero real");
        Double num1 = scanner.nextDouble();
        System.out.println("Digite outro n�mero real");
        Double num2 = scanner.nextDouble();

        System.out.println(String.format("Resultado da soma \n%.1f", (num1 + num2)));
        System.out.println(String.format("Resultado da subtra��o \n%.1f", (num1 - num2)));
        System.out.println(String.format("Resultado da multiplica��o \n%.1f", (num1 * num2)));
        System.out.println(String.format("Resultado da divis�o \n%.1f", (num1 / num2)));
        scanner.close();
    }
}
