package com.mycompany.nivelamento4;

public class Termometro {
    Double temperaturaAtual;    
    Double temperaturaMax;
    Double temperaturaMin;
    Double conta;
    
    void aumentaTemperatura(Double aumento){
        conta = temperaturaAtual + aumento;
        
        if (aumento < 0) {
            System.out.println("Digite um valor válido para calcular o aumento "
                    + "de temperatura");
        }
        else if (conta >= temperaturaMax) {
            conta = temperaturaMax;
            System.out.println(String.format("Você aumentou a temperatura mais "
                    + "do que o permitido, a temperatura atual passa a ser a máxima"
                    + "permitida %.1d", conta));
        } else {
            temperaturaAtual = temperaturaAtual + aumento;
            System.out.println(String.format("A temperatura aumentou %.1f °C, logo a "
                + "temperatura atual é de %.1f °C", aumento, conta));
        }
        
        
    } 
    
    void diminuiTemperatura(Double diminui){
        conta = temperaturaAtual - diminui;
        
        if (diminui < 0) {
            System.out.println("Digite um valor válido para calcular a diferença "
                    + "de temperatura");
        }
        else if (conta <= temperaturaMin) {
            conta = temperaturaMin;
            System.out.println(String.format("Você diminui a temperatura mais "
                    + "do que o permitido, a temperatura atual passa a ser a mínima"
                    + "permitida %.1d", conta));
        } else {
            temperaturaAtual = temperaturaAtual + diminui;
            System.out.println(String.format("A temperatura diminuiu %.1d °C, logo a "
                + "temperatura atual é de %.1d", diminui, conta));
        }
    } 

    void exibeFahreinheit (Double converter) {
         Double temperaturaFahrenheit = ((converter*1.8) + 32.0);
         
         System.out.println(String.format("A temperatura colocada em graus Celsius"
                 + " é equivalente a %.2f °F", temperaturaFahrenheit));
    }
}
