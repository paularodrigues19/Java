package com.mycompany.objeto;

import javax.xml.transform.Source;

public class BilheteUnico {

    public static void main(String[] args) {
        FuncaoBilhete modos = new FuncaoBilhete();

        System.out.println("Digite seu CPF (apenas números)");
        modos.cpf = modos.digitar.next();

        System.out.println("Digite o saldo atual do seu bilhete");
        modos.saldo = modos.digitar.nextDouble();

        System.out.println("Selecione seu tipo de bilhete \n"
                + "1 - Especial \n"
                + "2 - Comum \n"
                + "3 - Estudante \n"
                + "4 - Passe Livre \n");
        modos.tipo = modos.digitar.nextInt();

        switch (modos.tipo) {
            case 1:
                System.out.println("Seu bilhete é do tipo Especial \n");
                break;
            case 2:
                System.out.println("Seu bilhete é do tipo Comum \n");
                break;
            case 3:
                System.out.println("Seu bilhete é do tipo Estudante \n");
                break;
            case 4:
                System.out.println("Seu bilhete é do tipo Passe Livre \n");
                break;
            default:
                System.out.println("Digite um valor válido \n");
            }
    
    }
    
}
