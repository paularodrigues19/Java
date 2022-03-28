package com.sptech.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio_Again {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 100");
        Integer digitado = numero.nextInt();
        Integer par = 0;       
        Integer impar = 0;

        
        if (digitado < 1 || digitado > 100 ) {
            System.out.println("O número digitado deve estar entre 1 e 100");
            System.out.println("Digite um número entre 1 e 100");
            digitado = numero.nextInt();
        };
        
        for (Integer i = 1; i < 201; i++){
            Integer Random = ThreadLocalRandom.current().nextInt(1,100);
            if (Random == digitado) {
                System.out.println(String.format("Seu número da sorte saiu no %d° sorteio", i));      
            };
            if ( Random % 2 == 0) { par++; };
            if ( Random % 2 == 1) { impar++; };
        };
        
        System.out.println(String.format("Total números pares %d", par) );        
        System.out.println(String.format("Total números ímpares %d", impar));

    }
}
