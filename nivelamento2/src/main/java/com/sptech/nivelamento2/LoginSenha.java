
package com.sptech.nivelamento2;

import java.util.Scanner;
import javax.print.ServiceUIFactory;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        
        System.out.println("Digite seu login:");  
        String login = digitar.nextLine();
        
        System.out.println("Digite sua senha:");
        String senha = digitar.nextLine();

        while ( !login.equals("admin") || !senha.equals("#BandTec")){
                System.out.println("Login e/ou senha inválidos");
                
            System.out.println("Digite seu login:");  
            login = digitar.nextLine();
        
            System.out.println("Digite sua senha:");
            senha = digitar.nextLine();
        }
              
            System.out.println("Login realizado com sucesso");
        
        
        };
        
        
    }

