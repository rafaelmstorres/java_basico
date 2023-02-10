package com.rafael.javabasico.aula11;

public class HexadecimalOctalBinario {

	public static void main(String[] args) {
		
		int decimal = 26; 
		
		int hexadecimal = 0x1a; //sempre começa com "0x"
		
		int octal = 032; 
		
		int binario = 0b11010; //sempre começa com "0b" (somente a partir do Java 7)
		
		System.out.println("Decimal: "+decimal);
		System.out.println("Hexadecimal: "+hexadecimal);
		System.out.println("Octalal: "+octal);
		System.out.println("Binário: "+binario);

	}

}
