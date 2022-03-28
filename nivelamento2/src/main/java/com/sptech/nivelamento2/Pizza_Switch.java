package com.sptech.nivelamento2;

import java.util.Scanner;

public class Pizza_Switch {
    public static void main(String[] args) {
        Scanner sabor = new Scanner(System.in);
        
        int mucarela = 0;
        int calabreza = 0;
        int QuatroQueijos = 0;
        
        for (Integer i = 1; i < 11; i++){
        
        System.out.println(String.format("Aluno %d digite seu valor de pizza favorito "
                    + "\n Digite 5 para votar no sabor muçarela"
                    + "\n Digite 25 para votar no sabor Calabreza"
                    + "\n Digite 50 para votar no sabor Quatro Queijos", i));
        
        int num = sabor.nextInt();        
  
        switch (num) {
            case 5:
                System.out.println("Você escolheu o sabor muçarela");
                mucarela++;
                break;
            case 25:
                System.out.println("Você escolheu o sabor calabreza");
                calabreza++;
                break;
            case 50:
                System.out.println("Você escolheu o sabor Quatro Queijos");
                QuatroQueijos++;
                break;
            default:
            System.out.println("Número inválido");
            i--;
            
        }       
    }
 if (mucarela > calabreza && mucarela > QuatroQueijos) {
     System.out.println("Muçarela é o sabor favorito");
 }
 if (calabreza > mucarela && calabreza > QuatroQueijos) {
     System.out.println("Muçarela é o sabor favorito");
 }
 if (QuatroQueijos > calabreza && QuatroQueijos > mucarela) {
     System.out.println("Muçarela é o sabor favorito");
 }
}
}