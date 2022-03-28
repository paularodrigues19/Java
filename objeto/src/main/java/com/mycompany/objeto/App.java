package com.mycompany.objeto;

public class App {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        conta1.nome = "Diego";
        conta1.saldo = 0.0;

        conta2.nome = "Paula";
        conta2.saldo = 1000000.0;
        
        conta1.depositar(10.0);
        conta2.sacar(101.0);
        
        System.out.println(String.format("Seu saldo atual é de R$%.2f", conta1.saldo));
        System.out.println(String.format("Seu saldo atual é de R$%.3f", conta2.saldo));

    }
    
}
