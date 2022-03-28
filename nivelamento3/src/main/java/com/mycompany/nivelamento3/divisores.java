package com.mycompany.nivelamento3;

import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        
        Scanner digitar = new Scanner(System.in);
        Index primo = new Index();
        
        Integer natural;
        
        do {
            System.out.println("\n Digite um número natural");
            natural = digitar.nextInt();
            primo.verificarPrimo(natural);

            
        } while (natural > 1);     
    }
    
}
