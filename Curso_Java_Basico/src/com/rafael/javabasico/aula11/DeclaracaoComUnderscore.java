package com.rafael.javabasico.aula11;

public class DeclaracaoComUnderscore {

	public static void main(String[] args) {

		long cartaoCredito = 1234_5678_9012_3456l;
		long cpf = 116_514_321_64l;
		float pi = 3.14_15926f;
		long hexaBytes = 0xff_ec_de_5f;
		long hexaWords = 0xcafe_babe;
		long maxLong = 0x7FFF_FFFF_FFFF_FFFFL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println(cartaoCredito);
		System.out.println(cpf);
		System.out.println(pi);
		System.out.println(hexaBytes);
		System.out.println(hexaWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);

	}

}
