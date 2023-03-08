package me.dio.DesafiosDIO;

import java.util.Scanner;

public class DesafioSoma_H_comNTermos {

/*     Desafio
    Neste desafio, faça um programa que calcule o valor de H com N termos. 

    Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

    Entrada 
    A entrada consiste em um número inteiro positivo. 

    Saída 
    Na saída será impresso o valor que representa a soma dos termos. */

    public static void main(String[] Args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double h = 0.0;
        for(int i = 1; i <= n; i++) {
          h += (1.0 / i);
        }
        scan.close();
        System.out.println(Math.round(h));
           
       }
    
}
