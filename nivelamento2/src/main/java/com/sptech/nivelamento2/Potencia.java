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
public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de base: ");
        Integer numeroBase = scan.nextInt();
        System.out.println("Digite um expoente: ");
        Integer numeroExpoente = scan.nextInt();
        Integer result= 1;
        for (int count = 0; count <= numeroExpoente; count++) {
            result *= numeroBase;
        }
        System.out.println(String.format("Resultado da potência: %d", result));
    }
}
