package DesafioConta;

import DesafioConta.interfaces.Imposto;

public class ContaPoupanca extends Conta implements Imposto {

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);

	}

	@Override
	public double rendimento() {

		double rend = super.getSaldo() * 0.05;

		return rend;
	}

	@Override
	public double calcularImposto(double rendimento) {
		
		double imposto = rendimento * 0.10;
		
		return imposto;
	}

}
