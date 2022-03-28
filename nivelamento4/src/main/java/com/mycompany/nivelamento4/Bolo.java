package com.mycompany.nivelamento4;

import java.util.Scanner;

public class Bolo {

    Scanner digitar = new Scanner(System.in);
    
    Integer sabor;
    Double valor = 0.00;
    Integer quantidadeVendida;
    Double totalValor = 0.00;

    void comprarBolo () {
        

        System.out.println("Digite a quantidade de bolos que você deseja adquirir \n"
                + "OBS: a quantidade adquirida não pode ser menor que 5 ou maior "
                + "100");
        
        quantidadeVendida = digitar.nextInt();
        
        if (quantidadeVendida < 5) {
            System.out.println("Você deve adquirir mais que 5 bolos para "
                    + "realizar uma encomenda");
                    
        }
        else if (quantidadeVendida > 100) {
            System.out.println("Você ultrapassou o limite de encomendas permitida");
                    
        } else {
            System.out.println(String.format("Você adquiriu %d bolos, o valor da sua conta é de"
                    + " R$%.2f", quantidadeVendida, totalValor));

        }
    }
    
    void exibirRelatorio() {
        
        Double total = (quantidadeVendida*valor);
        System.out.println(String.format("O bolo sabor %d, foi comprado %d vezes "
                + "hoje, totalizando R$ %.2f", valor, quantidadeVendida, total));

    }
}
