//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
//Fórmula: C = (5 * (F-32)) / ).

package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Farenheit: ");
		double temperaturaF = scan.nextDouble();
		
		double temperaturaC = (5 * (temperaturaF - 32)) / 9;
		
		System.out.printf("A temperatura em Celsius é: %,.2f",temperaturaC);

	}
}