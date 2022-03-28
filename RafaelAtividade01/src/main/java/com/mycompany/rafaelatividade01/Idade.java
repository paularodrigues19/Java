package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println(String.format("Ol�, %s! Qual o ano de seu nascimento?", nome));
        Integer anoNascimento = scanner.nextInt();

        System.out.println(String.format("Em 2030 voc� ter� %d anos ", (2030 - anoNascimento)));
        scanner.close();
    }
}
