package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {

		int idades[] = new int[11];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i+i;
			System.out.println(idades[i]);
		}

	}

}
