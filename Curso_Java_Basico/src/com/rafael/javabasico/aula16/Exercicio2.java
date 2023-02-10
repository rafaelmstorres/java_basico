package com.rafael.javabasico.aula16;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		do {
			System.out.print("Digite o nome de usuário: ");
			String nomeUsuario = scan.next();
			
			System.out.print("Digite a senha: ");
			String senha = scan.next();
			
			//comparação entre "Strings" ignorando maiúsculas e minúsculas ("variavel1.equalsIgnoreCase(variavel2)")
			if (nomeUsuario.equalsIgnoreCase(senha)) { 
				System.out.println("Usuário e senha iguais! Digite novamente. \r");
			} else {
				infoValida = true;
				System.out.println("Usuário e senha válidos.");
			}
			
		} while(!infoValida);
	}

}
