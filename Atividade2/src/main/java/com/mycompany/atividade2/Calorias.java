package com.mycompany.atividade2;

import java.util.Scanner;


public class Calorias {
    public static void main(String[] args) {
                Scanner calorias = new Scanner(System.in);
                
        System.out.println("Digite seu Nome:");
        String nome = calorias.next();
        
        System.out.println("Quantos minutos durou seu aquecimento");
        Integer aquecendo = calorias.nextInt();
        
        System.out.println("Quantos minutos durou os exercícios aeróbicos");
        Integer aerobico = calorias.nextInt();
        
        System.out.println("Quantos minutos duraram as atividades de musculação");
        Integer musculacao = calorias.nextInt();
        
        Integer soma = (aquecendo) + (aerobico) + (musculacao);
        Integer total = (aquecendo*12) + (aerobico*20) + (musculacao*25);
        
        System.out.println(String.format("Olá, %s. Você fez um total de %d "
                + "minutos de exercícios e perdeu cerca de %d calorias", nome, soma, total));
    }
}
