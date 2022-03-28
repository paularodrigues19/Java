package com.mycompany.nivelamento4;

import java.util.Scanner;

public class TesteTermometro {

    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        Termometro util = new Termometro();

        util.temperaturaMax = 100.00;
        util.temperaturaMin = -60.00;
        
        Double temperatura;

        System.out.println("Digite a temperatura atual");
        util.temperaturaAtual = digitar.nextDouble();

        System.out.println("Digite o calculo que você deseja efetuar com essa"
                + " temperatura \n"
                + "1 - Efetuar um AUMENTO da temperatura \n"
                + "2 - Efetuar uma DIMINUIÇÃO da temperatura \n"
                + "3 - Converte-la para Fahreinheit");
        Integer num = digitar.nextInt();

        switch (num) {
            case 1:
                System.out.println("Digite o quanto você quer aumentar de temperatura");
                temperatura = digitar.nextDouble();
                util.aumentaTemperatura(temperatura);
                break;
            case 2:
                System.out.println("Digite o quanto você quer diminuir de temperatura");
                temperatura = digitar.nextDouble();
                util.diminuiTemperatura(temperatura);
                break;
            case 3:
                util.exibeFahreinheit(util.temperaturaAtual);
                break;
            default:
                System.out.println("Digite um valor válidos");
        }

    }

}
