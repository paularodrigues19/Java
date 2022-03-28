package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite de peso de um elevador");
        Double limitePesoElevador = scanner.nextDouble();
        System.out.println("Digite o limite de pessoas");
        Integer limitePessoa = scanner.nextInt();

        System.out.println("Digite o peso da 1� pessoa");
        Double peso1 = scanner.nextDouble();
        System.out.println("Digite o peso da 2� pessoa");
        Double peso2 = scanner.nextDouble();
        System.out.println("Digite o peso da 3� pessoa");
        Double peso3 = scanner.nextDouble();

        System.out.println(String.format(
                "Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\r\n"
                + "O peso total no elevador � de %.2f, sendo que ele suporta Z",
                limitePessoa, (peso1 + peso2 + peso3), limitePesoElevador));
        scanner.close();

    }
}
