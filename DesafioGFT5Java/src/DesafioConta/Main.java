package DesafioConta;

public class Main {

	public static void main(String[] args) {

		// QUESTÃO 1 - RENDIMENTO DA CONTA CORRENTE E POUPANÇA

		ContaCorrente cc = new ContaCorrente(1, "romeu", 1000.0);
		ContaPoupanca cp = new ContaPoupanca(2, "julieta", 1050.0);

		double rendimentoCorrente = cc.rendimento();
		double rendimentoPoupanca = cp.rendimento();

		System.out.println("O Rendimento da ContaCorrente é igual a: " + rendimentoCorrente);
		System.out.println("O Rendimento da ContaPoupanca é igual a: " + rendimentoPoupanca);

		// ------------------------

		// QUESTÃO 2 - CALCULAR IMPOSTO CONTA CORRENTE E POUPANÇA

		System.out.println(cc.calcularImposto(rendimentoCorrente));
		System.out.println(cp.calcularImposto(rendimentoPoupanca));

		// -------------------------

	}

}
