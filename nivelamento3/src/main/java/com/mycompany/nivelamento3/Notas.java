package com.mycompany.nivelamento3;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
        Index calculo = new Index();
         
        System.out.println("Digite sua nota da Avaliação Continuada");
        Double av1 = media.nextDouble();
        
        System.out.println("Digite sua nota da Avaliação Integrada");
        Double av2 = media.nextDouble(); 
        
        Double notas = calculo.calcularMedia(av1, av2);
        System.out.println(notas);
                
    }
   
   
}
