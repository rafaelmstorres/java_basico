package com.rafael.javabasico.aula13;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a medida do raio do círculo: ");
		double raio = scan.nextDouble();
		
		//área do círculo = pi * raio elevado ao quadrado (A = πr²)
		//"Math.PI" é a constante de pi (3.14)
		//"Match.pow(base, potência)"
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		
		System.out.println("Área do círculo: "+areaCirculo);

	}

}
