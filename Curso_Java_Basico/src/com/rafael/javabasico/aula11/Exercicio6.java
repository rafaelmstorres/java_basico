//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área (A = Pi * raio²).

package com.rafael.javabasico.aula11;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é: %,.2f",area);

	}
}