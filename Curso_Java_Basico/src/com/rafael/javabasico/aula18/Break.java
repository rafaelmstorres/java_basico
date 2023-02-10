package com.rafael.javabasico.aula18;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		System.out.print("Digite um limite: \r");
		int max = scan.nextInt();
		
		System.out.println("No intervalo de "+num+ " até "+max+ ":");
		
		for (int i=num; i<=max; i++) {
			
			//faz a verificação dos múltiplos de 7 (divisíveis com resto = 0)
			if (i % 7 == 0) {
				
				//para de verificar assim que acha o 1º multiplo, sem o break verifica todos os números
				System.out.println("O primeiro múltiplo de 7 é: "+i); break;
			}
		}

	}

}
