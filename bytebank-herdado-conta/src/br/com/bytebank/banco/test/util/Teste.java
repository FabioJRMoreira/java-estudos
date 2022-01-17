package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		contas.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		contas.add(cc2);
		
		System.out.println(contas.size());
		
		Conta ref =(Conta)contas.get(0);
		
		System.out.println(ref.getNumero());
		
		contas.remove(0);
		
		System.out.println(contas.size());
		
		Conta cc3 = new ContaCorrente(22, 13);
		contas.add(cc3);

		Conta cc4 = new ContaCorrente(22, 23);
		contas.add(cc4);
		
		Conta cc5 = new ContaCorrente(22, 14);
		contas.add(cc5);

		Conta cc6 = new ContaCorrente(22, 24);
		contas.add(cc6);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		
 	}
}
