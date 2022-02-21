package com.sptech.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        
        System.out.println("Digite um número para sorteio entre 1 e 100");
        Integer Random = ThreadLocalRandom.current().nextInt(1,100);

        Integer sorteio = digitar.nextInt();
        
        System.out.println("Digite um número de 1 a 100");
         
        while(sorteio < 1 || sorteio > 100) {
            System.out.println("O número digitado deve estar entre 1 e 100");
            System.out.println("Digite um número de 1 a 100");
            sorteio = digitar.nextInt();
        };
        

        for (Integer i = 0; i<200; i++) {
            Random = ThreadLocalRandom.current().nextInt(0,100);
            if ( Random == i) {
                System.out.println(String.format("Seu número foi sorteado após %d tentativas", i));
        
            }
        }
    }
}
