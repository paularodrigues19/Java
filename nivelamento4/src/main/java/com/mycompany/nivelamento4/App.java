package com.mycompany.nivelamento4;

public class App {

    public static void main(String[] args) {

        Bolo util = new Bolo();

        System.out.println("Qual sabor de bolo você deseja adquirir \n \n"
                + "1 - Chocolate, valor 50 reais \n"
                + "2 - Morango, valor 40 reais \n"
                + "3 - Abacaxi, valor 30 reais ");

        util.sabor = util.digitar.nextInt();

        switch (util.sabor) {
            case 1:
                System.out.println("Você escolheu o sabor CHOCOLATE");
                util.totalValor = util.valor + 50;
                break;

            case 2:
                System.out.println("Você escolheu o sabor MORANGO");
                util.totalValor = util.valor + 40;
                break;

            case 3:
                System.out.println("Você escolheu o sabor ABACAXI");
                util.totalValor = util.valor + 30;
                break;

            default:
                System.out.println("Insira um sabor de bolo válido");
                break;
        }

        util.comprarBolo();
        util.exibirRelatorio();

    }
}
