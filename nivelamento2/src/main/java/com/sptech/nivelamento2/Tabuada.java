package com.sptech.nivelamento2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numero = tabuada.nextInt();
        
        System.out.println("Tabuada do " + numero);
        for (Integer i = 0; i <= 10; i++){
            Integer resultado = numero*i;
            System.out.println("\n" + resultado);
        }
    }
}
