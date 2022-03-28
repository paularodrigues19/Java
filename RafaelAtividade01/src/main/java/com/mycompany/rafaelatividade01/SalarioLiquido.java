package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu sal�rio bruto");
        Double salario = scanner.nextDouble();
        System.out.println("Digite a condu��o di�ria de ida");
        Double valorIda = scanner.nextDouble();

        Double inss = salario * 0.1;
        Double ir = salario * 0.2;
        Double descontoVt = valorIda * 2 * 22;

        Double descontos = inss - ir - descontoVt;
        Double salarioLiquido = salario - descontos;

        System.out.println(String.format("Seu sal�rio bruto � R$%.2f, tem um total de R$%.2f em descontos e receber� um l�quido de R$%.2f", salario, descontos, salarioLiquido));
        scanner.close();
    }
}
