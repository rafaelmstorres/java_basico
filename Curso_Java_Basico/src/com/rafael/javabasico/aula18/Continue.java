package com.rafael.javabasico.aula18;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		System.out.print("Digite um limite: \r");
		int max = scan.nextInt();
		
		System.out.println("No intervalo de "+num+ " até "+max+ ":");
		
		for (int i=num; i<=max; i++) {
			
			//faz a verificação dos múltiplos de 7 (divisíveis com "resto (mod) = 0")
			if (i % 7 == 0) {
				
				//quando a condição é verdadeira continua o loop e não executa a ação que está após o "continue"
				continue;
			}
			
		//todos os múltiplos de 7 foram excluídos da impressão na tela	
		System.out.println("Não é múltiplo de 7: "+i);
		
		}

	}

}
