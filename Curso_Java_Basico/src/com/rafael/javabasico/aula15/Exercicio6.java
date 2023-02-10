package com.rafael.javabasico.aula15;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Responda S (sim) ou N (não): \r");
		System.out.print("Telefonou para a vítima? ");
		String resp1 = scan.next();

		System.out.print("Esteve no local do crime? ");
		String resp2 = scan.next();
		
		System.out.print("Mora perto da vítima? ");
		String resp3 = scan.next();
		
		System.out.print("Devia para a vítima? ");
		String resp4 = scan.next();
		
		System.out.print("Já trabalhou com a vítima? \r");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) { cont++; }
		if (resp2.equalsIgnoreCase("S")) { cont++; }
		if (resp3.equalsIgnoreCase("S")) { cont++; }
		if (resp4.equalsIgnoreCase("S")) { cont++; }
		if (resp5.equalsIgnoreCase("S")) { cont++; }
		
		if (cont == 2) { System.out.println("Suspeito"); }
		else if (cont == 3 || cont == 4) { System.out.println("Cúmplice"); }
		else if (cont == 5) { System.out.println("Assassino"); }
		else { System.out.println("Inocente"); }
	}

}
