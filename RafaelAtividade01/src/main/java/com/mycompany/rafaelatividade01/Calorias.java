package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class Calorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor unit�rio do produto");
        Integer valorUnitario = scanner.nextInt();
        System.out.println("Digite a quantidade vendida do produto");
        Integer qtdVendida = scanner.nextInt();
        System.out.println("Digite o valor pago pelo cliente");
        Integer valorPago = scanner.nextInt();
        System.out.println(String.format("Seu troco ser� de R$ %.2f", (valorPago - (valorUnitario * qtdVendida))));
        scanner.close();
    }
}
