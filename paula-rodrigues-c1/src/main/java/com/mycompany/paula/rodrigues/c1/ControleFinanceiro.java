package com.mycompany.paula.rodrigues.c1;

import java.util.Scanner;

public class ControleFinanceiro {

    // 1)  Cadastro de economias
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        // O programa deve perguntar ao usuário seu valor (R$) guardado:
        System.out.println("Bem-vindo jovem! Realize o controle de suas economias:"
                + "\nValor Guardado:");
        Double valorGuardado = digitar.nextDouble();

        // Armazene a quantidade digitada e em seguida, pergunte a meta de economia:
        System.out.println("Meta de economia (%)");
        Double metaEconomia = digitar.nextDouble();

        // Calcule o valor que o usuário precisa economizar de acordo com o valor
        // guardado e a porcentagem do valor a ser economizado, e em seguida exiba 
        // utilizando a interpolação de texto
        Double economizar = (valorGuardado * metaEconomia / 100);
        System.out.println(String.format("Para atingir sua meta, você precisa "
                + "economizar %.2f !", economizar));

        // 2) Menu de opções
        System.out.println("Escolha os próximos passos \n"
                + "1 - Gastar \n"
                + "2 - Sair");

        int num = digitar.nextInt();
        Integer i = 0;


        switch (num) {
            case 1:
                System.out.println("Digite o valor que deseja retirar do cofrinho "
                        + "virtual");
                Double retirar = digitar.nextDouble();
                while (valorGuardado > 0) {
                    if (retirar > valorGuardado) {
                        System.out.println(String.format("\nInfelizmente você não possui saldo"
                                + " suficiente para o valor digitado. \n"
                                + "Saldo Disponível: %.2f \n"
                                + "Digite uma quantidade válida:", valorGuardado));
                        retirar = digitar.nextDouble();

                    } else if (retirar < valorGuardado) {
                        i++;
                        valorGuardado  = (valorGuardado - retirar);
                        System.out.println(String.format("Retirando R$ %.2f pela "
                                    + "%d° vez", retirar, i));  
                        
                        System.out.println(String.format("\nVocê acabou de retirar R$ %.2f \n"
                                + "Saldo atual R$ %.2f \n"
                                + "Meta de Economia R$ %.2f \n", retirar, valorGuardado, economizar ));
                        
                        System.out.println("Digite o valor que deseja retirar do cofrinho "
                        + "virtual");
                        
                        retirar = digitar.nextDouble();
       
                    } else if ( valorGuardado == retirar) {
                        System.out.println("Você retirou todo seu saldo");
                        break;
                    }
                }
                break;
                
            case 2:
                System.out.println("Até logo");
                break;
            default:
                System.out.println("Número inválido");
        }

    }
}


