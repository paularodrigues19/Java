package com.sptech.nivelamento2;

import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {
        Scanner pizza = new Scanner(System.in);

        Integer mucarela = 0;
        Integer calabreza = 0;
        Integer QuatroQueijos = 0;

        for (Integer i = 1; i < 11; i++) {
            System.out.println(String.format("Aluno %d digite seu valor de pizza favorito "
                    + "\n Digite 5 para votar no sabor muçarela"
                    + "\n Digite 25 para votar no sabor Calabreza"
                    + "\n Digite 50 para votar no sabor Quatro Queijos", i));

            Integer voto = pizza.nextInt();
            if (voto == 5) { mucarela++;}
            if (voto == 25) { calabreza++;}
            if (voto == 50) {QuatroQueijos++; }

            if (voto != 5 && voto != 25 && voto != 50) {
                i--;
                System.out.println("\n O valor inválido \n ");
            }
        }
        if (mucarela > calabreza && mucarela > QuatroQueijos) {
            System.out.println("\n Muçarela é o sabor de pizza favorito");
        }
        if (calabreza > mucarela && calabreza > QuatroQueijos) {
            System.out.println("\n Calabreza é o sabor de pizza favorito");
        }
        if (QuatroQueijos > mucarela && QuatroQueijos > calabreza) {
            System.out.println("\n Quatro Queijos é o sabor de pizza favorito");
        }
        
        
        if (QuatroQueijos == mucarela) {
            System.out.println("\n Quatro Queijos e Muçarela são os sabores de pizza favoritos");
        }
        if (QuatroQueijos == calabreza) {
            System.out.println("\n Quatro Queijos e Calabreza são os sabores de pizza favoritos");
        }
        if (mucarela == calabreza) {
            System.out.println("\n Muçarela e Calabreza são os sabores de pizza favoritos");
        }
    }
}