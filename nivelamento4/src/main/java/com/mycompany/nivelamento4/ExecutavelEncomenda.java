package com.mycompany.nivelamento4;

import java.util.Scanner;

public class ExecutavelEncomenda {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        Encomenda util = new Encomenda();
        
        System.out.println("Digite o valor da encomenda:");
        util.valorEncomenda = digitar.nextDouble();
        
        
        System.out.println("""
                           Selecione o tamanho da encomenda 
                           1 - Encomenda tamanho P 
                           2 - Encomenda tamanho M 
                           3 - Encomenda tamanho G""");
        
        Integer num = digitar.nextInt();
        
        util.tamanho(num);
        
        System.out.println("Digite o endereço do REMETENTE");
        util.enderecoRemetente = digitar.next();
        
        System.out.println("Digite o NÚMERO de endereço do REMETENTE");
        util.numeroRemetente = digitar.nextInt();
        
        System.out.println("Digite o endereço do DESTINATÁRIO");
        util.enderecoDestinatario = digitar.next();

        System.out.println("Digite o NÚMERO de endereço do DESTINATÁRIO");
        util.numeroDestinatario = digitar.nextInt();
        
        util.calcularFrete();
        
        util.emitirEtiqueta();
    }
    
}
