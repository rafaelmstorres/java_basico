package com.rafael.javabasico.aula15;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Resolução de Equação do 2º Grau");
		System.out.print("Digite o valor de \"a\": ");
		double a = scan.nextDouble();
		
		if (a == 0 ) {
			System.out.println("Não é uma equeção do segundo grau.");
		} else {
			System.out.print("Digite o valor de \"b\": ");
			double b = scan.nextDouble();
			System.out.print("Digite o valor de \"c\": ");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			System.out.println("Valor de Delta: "+delta);
			
			if (delta < 0) {
				System.out.print("A equação não possui raízes reais.");
			} else if (delta == 0) {
				double raizUnica = ((-b) + Math.sqrt(delta)) / (2 * a); //"Math.sqrt(valor)" calcula a raiz quadrada de um número
				System.out.print("A equação possui uma raiz real: "+raizUnica);
			} else {
				double raiz1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double raiz2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.print("A equação possui duas raízes reais: "+raiz1+ " e "+raiz2);
			}
		}
	}
}
