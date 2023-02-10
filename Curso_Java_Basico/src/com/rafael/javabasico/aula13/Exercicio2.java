/*João comprou um computador para controlar o rendimento diário de seu trabalho. Toda vez
 que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado
 de São Paulo (50kg) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
 você faça um programa que leia o peso de peixes e verifique se há excesso. Se houver gravar
 na variável excesso, e gravar na variável multa o valor da multa que João deverá  pagar.
 Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

package com.rafael.javabasico.aula13;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o peso total dos peixes em kilos: ");
		double peso = scan.nextDouble();
		
		double excesso = 0;
		double multa = 0;
		
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		
		System.out.println("Excesso de peso: "+excesso+" kg");
		System.out.println("Valor da multa: R$ "+multa);

	}

}
