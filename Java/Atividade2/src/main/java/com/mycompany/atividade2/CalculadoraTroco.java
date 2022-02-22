package com.mycompany.atividade2;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto");
        Double valor = calculadora.nextDouble();
        
        System.out.println("Digite  a quantidade de itens que o cliente solicitou");
        Integer qtd = calculadora.nextInt();
        
        System.out.println("Valor total recebido");
        Double dinheiro = calculadora.nextDouble();
        
        Double total = valor*qtd;
        Double troco = dinheiro-total;

       if (dinheiro < total) {
           System.out.println("Complete o valor a ser pago para completar a transação");
       
       } else {
           System.out.println(String.format("Seu troco será de R$ %.2f", troco));
           
       };
}
    
}
