//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Digite quantas horas trabalhou no mês: ");
		int horasDeTrabalho = scan.nextInt();
		
		double salarioMensal = valorHora * horasDeTrabalho;
		
		System.out.printf("Salário mensal: R$ %,.2f",salarioMensal);

	}
}