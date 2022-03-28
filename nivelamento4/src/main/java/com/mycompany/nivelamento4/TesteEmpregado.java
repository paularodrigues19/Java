package com.mycompany.nivelamento4;

import java.util.Scanner;

public class TesteEmpregado {

    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        Empregado util = new Empregado();
        Empregado util2 = new Empregado();

        util.nome = "João";
        util.cargo = "Analista de Sistemas";
        util.salario = 5400.00;
        
        util2.nome = "Paula";
        util2.cargo = "Cientista de Dados";
        util2.salario = 10000.00;

        Double salarioJoao = util.reajustarSalario(0.15);
        Double salarioReajuste = util.salario + salarioJoao;
        
        Double salarioPaula = util2.reajustarSalario(0.3);
        Double salarioReajustePaula = util2.salario + salarioPaula;

        System.out.println(String.format("O funcionário %s, que possui o cargo de %s, na "
                + "empresa Tabajara recebe o salário de R$ %.2f \n"
                + "Atualmente %s irá receber um ajuste, o que lhe irá "
                + "totalizar um salário de %.2f \n \n", util.nome, util.cargo,
                util.salario, util.nome, salarioReajuste));
        
        System.out.println(String.format("A funcionária %s, que possui o cargo de %s, na "
                + "empresa Tabajara recebe o salário de R$ %.2f \n"
                + "Atualmente %s irá receber um ajuste, o que lhe irá "
                + "totalizar um salário de %.2f", util2.nome, util2.cargo,
                util2.salario, util2.nome, salarioReajustePaula));

    }

}
