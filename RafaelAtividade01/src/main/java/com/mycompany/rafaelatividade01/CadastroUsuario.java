package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu login");
        String login = scanner.next();
        System.out.println("Digite a sua senha");
        String senha = scanner.next();
        System.out.println("Digite o limite de vezes poss�veis");
        Integer limit = scanner.nextInt();
        System.out.println(String.format("Seu login � %login e sua senha � %s. Voc� tem %d tentativas antes de ser bloqueado", login, senha, limit));
        scanner.close();
    }
}
