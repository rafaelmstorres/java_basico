//Faça um Programa que converta metros para centímetros.

package com.rafael.javabasico.aula11;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a medida em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(metros+" m equivale a "+centimetros+" centímetros.");

	}
}