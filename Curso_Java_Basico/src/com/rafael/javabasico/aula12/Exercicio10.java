//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
//Fórmula: F = ((C * 9) / 5) + 32;

package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		double farenheit = ((celsius * 9) / 5) + 32;
		
		System.out.printf("A temperatura em Farenheit é: %,.2f ºF",farenheit);

	}
}