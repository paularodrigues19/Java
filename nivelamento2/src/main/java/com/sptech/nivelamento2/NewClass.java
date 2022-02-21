package com.sptech.nivelamento2;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner pizza = new Scanner(System.in);
        
        for (Integer i = 1; i < 11; i++){
            System.out.println(String.format("Aluno %d digite seu valor de pizza favorito "
                    + "\n Digite 5 para votar no sabor muçarela"
                    + "\n Digite 25 para votar no sabor Calabreza"
                    + "\n Digite 50 para votar no sabor Quatro Queijos", i));
            
            Integer voto = pizza.nextInt();
            if (voto != 5 || voto != 25 || voto != 50) {
                i--;
                System.out.println("\n O valor inválido \n ");
            }
        }
                
    }
}
