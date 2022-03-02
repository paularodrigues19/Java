package com.mycompany.atividade2;

import java.util.Scanner;

public class Executável {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Cadastre seu Login");
        String Login = cadastro.next();
        
        System.out.println("Crie uma senha");
        String Senha = cadastro.next();
        
        System.out.println("Digite quantas tentativas de login incorretas "
                + "serão permitidas até o bloqueio da conta");
        Integer Qtd = cadastro.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. "
                + "Você tem %d tentativas antes de ser bloqueado", Login, Senha, Qtd));
            
    }
}
