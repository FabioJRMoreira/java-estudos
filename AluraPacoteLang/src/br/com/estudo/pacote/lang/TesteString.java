package br.com.estudo.pacote.lang;

public class TesteString {

	public static void main(String[] args) {
		
		String nome  = "Alura"; // object literal. imutavel nao muda nunca uma string.
		String nome1 = nome.toLowerCase();
		String nome2 = nome.toUpperCase();
		System.out.println(nome);
		System.out.println(nome1);
		System.out.println(nome2);
		
		// retorna o char na possicao passada.
		char c = nome.charAt(0);
		
		System.out.println(c);
		
		int pos = nome.indexOf("Al");
		
		System.out.println(pos);

		String sub  = nome.substring(3);
		
		System.out.println(sub);
		
		
		System.out.println(nome.length());
		
		//for(int q = 0; q<nome.length();q++) {
			//System.out.println(nome.charAt(q));
		//}
		
		for(String s : nome.split("")) {
			System.out.println(s);
		}
	}

}
