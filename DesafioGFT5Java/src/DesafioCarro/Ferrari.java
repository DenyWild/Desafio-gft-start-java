package DesafioCarro;

public class Ferrari extends Carro {

	private String tipoCombustivel;
	private final int VELOCIDADE_MAX = 300;
	private int velocidadeAtual;

	public Ferrari(String tipoCombustivel, int velocidadeAtual) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.velocidadeAtual = velocidadeAtual;
	}

	public void acelerar() {

		if (velocidadeAtual >= 0 && velocidadeAtual <= VELOCIDADE_MAX) {
			velocidadeAtual += 15;
		} else {
			velocidadeAtual = 0;
		}
	}

	public void freiar() {

		if (velocidadeAtual >= 0 && velocidadeAtual <= VELOCIDADE_MAX) {
			velocidadeAtual -= 15;
		} else {
			velocidadeAtual = 0;
		}

	}

	@Override
	public String toString() {
		return "Ferrari [tipoCombustivel=" + tipoCombustivel + ", VELOCIDADE_MAX=" + VELOCIDADE_MAX
				+ ", velocidadeAtual=" + velocidadeAtual + "]";
	}

}
