package DesafioConta;

import DesafioConta.interfaces.Imposto;

public class ContaCorrente extends Conta implements Imposto {

	public ContaCorrente(int numero, String titular, double saldo) {
		super(numero, titular, saldo);

	}

	@Override
	public double rendimento() {

		double rend = super.getSaldo() * 0.03;

		return rend;

	}

	@Override
	public double calcularImposto(double rendimento) {

		double imposto = rendimento * 0.25;

		return imposto;
	}

}
