package com.mycompany.atividade2;

import java.util.Scanner;

public class Semana1 {
    public static void main(String[] args) {
        Scanner conversa = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui");
        Integer filhos0_3 = conversa.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui");
        Integer filhos4_16 = conversa.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui");
        Integer filhos17_18 = conversa.nextInt();
        
        Integer soma = filhos0_3 +filhos4_16 + filhos17_18;        
        Double bolsa = filhos0_3*25.12 + filhos4_16*15.88 + filhos17_18*12.44;

        
        System.out.println
        (String.format("Você tem um total de filhos %d e vai receber R$ %.2f de bolsa", soma, bolsa));
    }
}
