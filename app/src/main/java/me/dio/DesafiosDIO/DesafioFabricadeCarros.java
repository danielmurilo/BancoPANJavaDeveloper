package me.dio.DesafiosDIO;

import java.util.Scanner;

public class DesafioFabricadeCarros {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int custoFabrica = scan.nextInt();
	int porcentagemDistribuidor = scan.nextInt();
	int percentualImpostos = scan.nextInt();
	scan.close();

	int distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
	int valorImpostos = (custoFabrica * percentualImpostos) / 100;        
	int custoConsumidor = custoFabrica + distribuidor + valorImpostos;

	System.out.println(custoConsumidor);
   }
    
}
