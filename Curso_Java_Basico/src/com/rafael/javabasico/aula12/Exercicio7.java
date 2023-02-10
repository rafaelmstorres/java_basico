//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário (A = lado²).

package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado de um quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		double area = Math.pow(ladoQuadrado, 2);
		double dobroArea = area * 2;
		
		System.out.println("Área do quadrado: "+area);
		System.out.println("Dobro da área: "+dobroArea);

	}
}