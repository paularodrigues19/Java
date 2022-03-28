package com.mycompany.rafaelatividade01;

import java.util.Scanner;

public class Esquisito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de filhos entre 0 e 3 anos");
        Integer filho03 = scanner.nextInt();
        System.out.println("Digite a quantidade de filhos entre 4 e 16 anos");
        Integer filho416 = scanner.nextInt();
        System.out.println("Digite a quantidade de filhos entre 17 e 18 anos");
        Integer filho1718 = scanner.nextInt();

        Integer total = filho03 + filho416 + filho1718;
        Double valorTotal = (filho03 * 25.12) + (filho416 * 15.88) + (filho1718 * 12.44);
        System.out.println(String.format("Voc� tem um total de %d filhos e vai receber R$ %.2f de bolsa", total, valorTotal));
        scanner.close();
    }
}
