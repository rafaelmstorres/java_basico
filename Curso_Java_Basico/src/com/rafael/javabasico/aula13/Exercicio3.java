/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
 da área a ser pintada. Considere que a cobertura da tinta é de 1L para cada 6m² e que a tinta é
 vendida em latas de 18L, que custam R$ 80,00 ou em galões de 3,6L, que custam R$ 25,00.
 Informe ao usuário as quantidade de tinta a ser comprada e o respectivo preço em 3 situações:
 1) comprar apenas latas de 18 litros;
 2) comprar apenas galões de 3,6 litros;
 3) misturar latas e galões, de forma que o preço seja o menor.
 Acrescente 10% de folga e arredonde os valores para cima, isto é, considere latas cheias.*/

package com.rafael.javabasico.aula13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a área a ser pintada em m²: ");
		double area = scan.nextDouble();
		System.out.println();
		
		double litros = area / 6;
		double lata = Math.ceil(litros / 18);
		double galao = Math.ceil(litros / 3.6);
		
		System.out.println("SELECIONE UMA OPÇÃO DE ORÇAMENTO:");
		System.out.println("1 - Apenas Latas || 2 - Apenas Galões || 3 - Latas e Galões");
		System.out.print("Opção: ");
		int opcao = scan.nextInt();
		System.out.println();
				
		switch (opcao) {
		case 1: System.out.println("Latas necessárias: "+lata);
				System.out.println("Preço: R$ "+(lata * 80)); break;
		case 2: System.out.println("Galões necessários: "+galao);
				System.out.println("Preço: R$ "+(galao * 25));break;
		case 3: if (litros > 10.8) {
			
		}
		System.out.println(Math.ceil(lata)); break;
		}
		
	}

}
