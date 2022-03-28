package com.mycompany.projeto.paula.rodrigues;

import java.util.Scanner;

public class Index {

    Scanner digitar = new Scanner(System.in);

    public void questionario() {

        Integer pontuacao = 0;

        System.out.println("Qual dessas músicas Jimin canta sem nenhum outro "
                + "membro do BTS \n"
                + "1 - Fire \n"
                + "2 - Dope \n"
                + "3 - Boy with Love  \n"
                + "4 - Serendipity  \n");
        Integer opcao = digitar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 2:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 3:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 4:
                System.out.println("Parabéns você acertou! Você ganhou 25 pontos \n");
                pontuacao = (pontuacao + 25);
                break;

            default:
                System.out.println("Opção inválida \n");

        }
        System.out.println("Qual a posição de Jimin no k-group BTS? \n"
                + "1 - Rapper \n"
                + "2 - Dançarino & Rapper \n"
                + "3 - Cantor Principal & Líder \n"
                + "4 - Dançarino Principal & Vocalista Líder \n");
        opcao = digitar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 2:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 3:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 4:
                System.out.println("Parabéns você acertou! Você ganhou 25 pontos \n");
                pontuacao = (pontuacao + 25);
                break;

            default:
                System.out.println("Opção inválida \n");

        }

        System.out.println("Jimin é embaixador de qual marca? \n"
                + "1 - Channel \n"
                + "2 - Renner \n"
                + "3 - Prada \n"
                + "4 - Dior \n");
        opcao = digitar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Parabéns você acertou! Você ganhou 25 pontos \n");
                pontuacao = (pontuacao + 25);
                break;

            case 2:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 3:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 4:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            default:
                System.out.println("Opção inválida \n");

        }

        System.out.println("Em qual desse MVs Jimin apareceu com o cabelo rosa? \n"
                + "1 - Boy with love \n"
                + "2 - Dope \n"
                + "3 - Fire \n"
                + "4 - Blood Sweat & Tears\n");
        opcao = digitar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Parabéns você acertou! Você ganhou 25 pontos \n");
                pontuacao = (pontuacao + 25);
                break;

            case 2:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 3:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            case 4:
                System.out.println("Opção incorreta! Você não pontuou nessa rodada \n");
                break;

            default:
                System.out.println("Opção inválida \n");

        }

        System.out.println(String.format("\nFim do Jogo! Nessa partida você teve "
                + "o total de %d pontos \n", pontuacao));
        pontuacao = 0;

    }

    public void case2() {
        System.out.println("Há quantos anos você é fã do Jimin?");
        Integer fa = digitar.nextInt();

        if (fa > 9) {
            System.out.println(String.format("Você é poser, há 9 atrás o Jimin não "
                    + "tinha entrado para o BTS, não tem como você ser "
                    + "fã dele a %d anos \n", fa));
        } else if (fa >= 6 && fa <= 9) {
            System.out.println(String.format("Você é fã do Jimin a %d anos!!"
                    + "Você começou a ser fã muito cedo e com certeza tem "
                    + "muito conhecimento sobre esse Idol \n", fa));
        } else if (fa >= 3 && fa <= 5) {
            System.out.println(String.format("Uau, parece que você conhece "
                    + "o Jimin a bastante tempo. Respeito sua trajetória \n", fa));
        } else if (fa >= 0 && fa <= 2) {
            System.out.println(String.format("Você é fã do Jimin a pouco "
                    + "tempo. Precisa aprender muito mais sobre ele \n", fa));
        } else if (fa < 0) {
            System.out.println(String.format("Digite um número válido \n", fa));
        }

    }

    public void case3() {
        System.out.println("Digite sua idade");
        Integer idade = digitar.nextInt();

        Integer jiminIdade = 26;
        Integer diferencaIdade;
        if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida!");
        } else if (idade == jiminIdade) {
            System.out.println("Jimin tem 26 anos.\n"
                    + "Você tem a mesma idade que o Jimim!");
        } else if (idade > jiminIdade) {
            diferencaIdade = (idade - jiminIdade);
            System.out.println(String.format("Jimin tem 26 anos.\n"
                    + "Você é %d anos mais "
                    + "velho(a) que o Jimin!", diferencaIdade));
        } else if (idade < jiminIdade) {
            diferencaIdade = (jiminIdade - idade);
            System.out.println(String.format("Jimin tem 26 anos.\n"
                    + "Você é %d anos mais novo(a)"
                    + " que o Jimin!", diferencaIdade));
        }
    }

    void menu() {

        System.out.println("Jimin é um cantor e dançarino sul-coreano. Jimin"
                + " ganhou destaque mundial como membro do grupo masculino BTS "
                + "(também conhecido como Bangtan Boys) \n \n"
                + "Este é um programa que mostra algumas curiosidades sobre esse "
                + "artista. Selecione uma opção para a aplicação iniciar \n"
                + "1 - Economia para o show \n"
                + "2 - Descubra o quanto você é fã do Jimin \n"
                + "3 - Saiba a diferença de idade entre você e o Jimin \n"
                + "4 - Teste, o quanto você conhece o Jimin \n"
                + "5 - Sair do programa \n"
                + "");
        Integer num = digitar.nextInt();

        switch (num) {

            case 1:
                case1();
                menu();
                break;

            // Quanto tempo você conhece o Jimin
            case 2:
                case2();
                menu();
                break;

            // Diferença de idade
            case 3:
                case3();
                menu();
                break;

            // Questionário sobre o Jimin
            case 4:
                questionario();

                System.out.println("Deseja jogar novamente? \n"
                        + "1 - Sim \n"
                        + "2 - Não \n");
                Integer jogar = digitar.nextInt();
                switch (jogar) {
                    case 1:
                        questionario();
                        break;

                    case 2:
                        System.out.println("Até outra hora!");
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
                break;

            // Bye
            case 5:
                System.out.println("Até uma próxima <3");
                break;

            default:
                System.out.println("Você digitou uma opção inválida");
                break;
        }
    }

    public void case1() {
        Integer dinheiro = 0;      
        Integer acumular = 0;
        
        System.out.println("Todo fã do Jimin tem o sonho de ir ao show dele. "
                + "Vamos fazer um planejamento de 5 meses para você economizar "
                + "dinheiro para poder ir ao show dele");

        for (Integer i = 1; i < 6; i++) {
            
            System.out.println(String.format("\nDigite a quantidade de dinheiro "
                    + "em R$ que você deseja economizar no %d°  mês", i));
            dinheiro = digitar.nextInt();
            
            if ( dinheiro < 0) {
                System.out.println(String.format("Operação inválida! \n"
                        + "Digite a quantidade de dinheiro que você pretende "
                        + "economizar no %d° mês para ir ao show do Jimin", i));
            i--;
            
            } else {
            acumular = acumular + dinheiro;
            System.out.println(String.format("Você economizou R$ %d em 5 meses",
                    acumular));
            }

        }
        
        System.out.println(String.format("Parabéns!! Você acumulou um total de R$"
                + "%d para o show do Jimin", acumular));

    }

}
