package com.mycompany.nivelamento3;

public class Index {

    public double calcularMedia(double a, double b) {
        return a * 0.4 + b * 0.6;
    }

    public void classificaIdade(Integer age) {

    }

    public void verificarPrimo(Integer number) {
        Boolean primo = true;
        for (Integer i = 3; i < number; i++) {
            if (number % i == 0) {
                primo = false;
                break;
            } else {
                primo = true;
            }
        }
        if (primo == true) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }
    }
 public void calculaPesoIdeal(boolean sexo, Double altura) {

    }
}


