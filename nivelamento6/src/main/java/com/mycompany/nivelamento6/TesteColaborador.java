package com.mycompany.nivelamento6;

import java.util.Scanner;

public class TesteColaborador {

    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        // Print Caracteristicas
        Colaborador utilColaboradorTeste1 = new Colaborador("Kleber",
                "Analista de Sistemas", 5000.00);
        System.out.println(utilColaboradorTeste1);

        Colaborador utilColaboradorTeste2 = new Colaborador("Valentina",
                "Cientista de Dados", 6000.00);
        System.out.println(utilColaboradorTeste2);

        // Chamaando Recursos Humanos
        RecursosHumanos utilRecursosHumanos = new RecursosHumanos();

        Colaborador colaboradorEscolhido = null;

        System.out.println("Escolha o colaborador: \n"
                + "1 - Kleber \n"
                + "2 - Valentina \n");
        Integer escolha = digitar.nextInt();

        switch (escolha) {

            case 1:
                colaboradorEscolhido = utilColaboradorTeste1;
                break;
            case 2:
                colaboradorEscolhido = utilColaboradorTeste2;
                break;
            default:
            // code block
        }

        // Promover Salario maior
        String cargo;
        Double novoSalario;
            
            System.out.println(String.format("Para qual cargo você quer "
                    + "promover %s", colaboradorEscolhido));
            cargo = digitar.next();

            System.out.println(String.format("Digite o novo salário que o colaborador(a) %s"
                    + "irá receber", colaboradorEscolhido));
            novoSalario = digitar.nextDouble();
          

        

        // System.out.println();
    }
}
