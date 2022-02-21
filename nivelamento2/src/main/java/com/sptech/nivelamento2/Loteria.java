/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner scanInteger = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10: ");
        Integer numeroDigitado =  scanInteger.nextInt();
        
        Integer count = 1;
        
        Integer numeroRandom = ThreadLocalRandom.current().nextInt(0,10);
        while(numeroDigitado != numeroRandom){
            numeroRandom = ThreadLocalRandom.current().nextInt(0,10);
            System.out.println(String.format("Numero sorteado: %d", numeroRandom));
            numeroDigitado = scanInteger.nextInt();
            count++;
        }
        if (count <= 3) {
            System.out.println("Você é MUITO sortudo!");
        }else if(count <= 10){
            System.out.println("Você é sortudo!");
        }
        else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
   
}
