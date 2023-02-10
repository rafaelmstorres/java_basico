//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo.
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 1º número inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		int numero2 = scan.nextInt();
		
		System.out.print("Digite um número real: ");
		double numero3 = scan.nextDouble();
		
		double resultadoA = (2 * numero1) * ((double) numero2 / 2);
		double resultadoB = (3 * numero1) + numero3;
		double resultadoC = Math.pow(numero3, 3);
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: "+resultadoA);
		System.out.println("Soma do triplo do primeiro com o terceiro: "+resultadoB);
		System.out.println("Terceiro elevado ao cubo: "+resultadoC);

	}
}