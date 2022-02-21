/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu usuário: ");
        String usuario = scan.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        while (!usuario.equals("admin") || !senha.equals("#Bandtec")) {
            System.out.println("Login e/ou senha invalidos\n");
            System.out.println("Digite seu usuário: ");
            usuario = scan.nextLine();
            System.out.println("Digite sua senha: ");
            senha = scan.nextLine();
        }
        System.out.println("Login realizado com sucesso");
    }
}
