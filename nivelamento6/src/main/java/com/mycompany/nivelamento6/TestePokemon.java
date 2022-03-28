package com.mycompany.nivelamento6;

import java.util.Scanner;

public class TestePokemon {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);
        // Pokemon Caracteristicas
        Pokemon utilPokemon1 = new Pokemon("Pikachu", "Raio", 20.0, 10.0);
        Pokemon utilPokemon2 = new Pokemon("Wobbuffet", "Paciência", 30.0, 20.0);
        
        Pokemon pokemonEscolhido = null;
        TreinadorPokemon utilTreinador = new TreinadorPokemon();

        //  Treinamento
        Integer treinamento = 0;

        System.out.println("Escolha seu Pokemon: \n"
                + "1 - Pikachu \n"
                + "2 - Wobbuffet \n");
        Integer escolha = digitar.nextInt();

        switch (escolha) {

            case 1:
                pokemonEscolhido = utilPokemon1;
                break;
            case 2:
                pokemonEscolhido = utilPokemon2;
                break;
            default:
            // code block
        }

        do {
            utilTreinador.treinarPokemon(pokemonEscolhido);
            treinamento++;
            String texto = String.format("\n"
                    + "Você treinou este Pokemon %d vezes "
                    + "agora seu Pokemon %s tem \n"
                    + "Força: %.2f \n"
                    + "Doces: %.2f \n"
                    + "Seu nível agora é %.2f", treinamento, pokemonEscolhido.getNome(),
                    pokemonEscolhido.getForca(), pokemonEscolhido.getDoces(), utilTreinador.getNivel());

            System.out.println(texto);

        } while (treinamento < 5);

        System.out.println("\n"
                + "Selecione uma opção: \n"
                + "1 - Treinar novamente o Pokemon \n"
                + "2 - Tentar evoluir o Pokemon \n"
                + "3 - Sair");

        Integer num = digitar.nextInt();
        do {
            switch (num) {
                case 1:
                    treinamento++;
                    utilTreinador.treinarPokemon(pokemonEscolhido);
                    String texto = String.format("\n"
                            + "Você treinou este Pokemon %d vezes "
                            + "agora seu Pokemon %s tem \n"
                            + "Força: %.2f \n"
                            + "Doces: %.2f \n"
                            + "Seu nível agora é %.2f", treinamento, pokemonEscolhido.getNome(),
                            pokemonEscolhido.getForca(), pokemonEscolhido.getDoces(), utilTreinador.getNivel());
                    System.out.println(texto);
                    break;
                case 2:
                    if (pokemonEscolhido == utilPokemon1) {
                    utilTreinador.evoluirPokemon(pokemonEscolhido, "Raichu");
                    } else {
                        utilTreinador.evoluirPokemon(pokemonEscolhido, "Wynaut");
                    };
                    break;
                default:
                    System.out.println("Selecione um valor válido");
                    break;
            }
            System.out.println("\n"
                    + "Selecione uma opção: \n"
                    + "1 - Treinar novamente o Pokemon \n"
                    + "2 - Tentar evoluir o Pokemon \n"
                    + "3 - Sair");
            num = digitar.nextInt();
        } while (num != 3);
    }
}
