package com.mycompany.nivelamento4;

import java.util.Scanner;

public class Encomenda {

    String tamanho;

    String enderecoRemetente;
    Integer numeroRemetente;

    String enderecoDestinatario;
    Integer numeroDestinatario;

    Double distancia;
    Double valorEncomenda;
    Double frete;

    Double total = 0.0;
    
    Scanner digitar = new Scanner(System.in);

    void tamanho(Integer num) {
        
        switch (num) {
            case 1: 
                System.out.println("Você selecionou o tamanho P");
                total = (valorEncomenda * 0.01);
                tamanho = "P";
                break;
            case 2:
                System.out.println("Você selecionou o tamanho M");
                total = (valorEncomenda * 0.03);
                tamanho = "M";
                break;
            case 3:
                System.out.println("Você selecionou o tamanho G");
                total = (valorEncomenda * 0.05);
                tamanho = "G";
                break;
            default:
                System.out.println("Selecione um valor correto");
        }
    }

    void calcularFrete() {
        System.out.println("Digite o valor da distância");
        distancia = digitar.nextDouble();

        if (distancia < 0) {
            System.out.println("Digite um valor de distancia válido");
        } else if (distancia < 51) {
            total += 3.0;
            frete = 3.0;
        } else if (distancia < 201) {
            total += 5.0;
            frete = 5.0;
        } else {
            total += 7.0;
            frete = 7.0;
        }

        total += valorEncomenda;

    }

    void emitirEtiqueta() {

        System.out.println(String.format("***** ETIQUETA PARA ENVIO ***** \n"
                + "Endereço do remetente: %s, %d \n"
                + "Endereço do destinatário %s, %d \n"
                + "Tamanho: %s \n"
                + "-------------------------------------------------- \n"
                + "Valor encomenda: %.2f \n"
                + "Valor frete: %.2f \n"
                + "-------------------------------------------------- \n"
                + "Valor total: %.2f \n", enderecoRemetente, numeroRemetente,
                enderecoDestinatario, numeroDestinatario, tamanho,
                valorEncomenda, frete, total));

    }
}
