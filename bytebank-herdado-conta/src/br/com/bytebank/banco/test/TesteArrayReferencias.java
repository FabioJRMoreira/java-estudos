package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Conta contas[] = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		ContaCorrente cc2 = new ContaCorrente(112, 221);
		ContaCorrente cc3 = new ContaCorrente(113, 223);
		ContaPoupanca cc4 = new ContaPoupanca(114, 224);
		ContaCorrente cc5 = new ContaCorrente(115, 225);
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		contas[3] = cc4;
		contas[4] = cc5;
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Agencia "+contas[i].getAgencia()+" Conta "+ contas[i].getNumero());
		}
	}

}
