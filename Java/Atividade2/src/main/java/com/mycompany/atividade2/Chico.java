package com.mycompany.atividade2;

import java.util.Scanner;

public class Chico {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Informe seu salário bruto");
        Double n1 = calculadora.nextDouble();
        
        System.out.println("Informe o quanto é gasto de transporte da sua casa até"
                + " o trabalho");
        Double n2 = calculadora.nextDouble();
        
        Double INSS = n1*0.1;
        Double IR = n1*0.2*22;
        Double VT = n2*2;
        Double total = n1 - (INSS + IR + VT);
        Double Descontos = (INSS + IR + VT);
        
        System.out.println(String.format("Seu salário bruto é R$ %.2f tem um total "
                + "de R$ %.2f em descontos e receberá um líquido de R$ %.2f", n1, Descontos, total));
        
    }
}
