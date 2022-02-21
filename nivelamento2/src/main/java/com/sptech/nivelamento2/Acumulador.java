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
public class Acumulador {
    public static void main(String[] args) {
        Scanner scanInteger =  new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numeroDigitado = scanInteger.nextInt();
        Integer count = 0;
        while (numeroDigitado != 0) {            
            count+= numeroDigitado;
            numeroDigitado = scanInteger.nextInt();
        }
        System.out.println(String.format("A soma dos numeros foi de: %d", count));
    }
}
