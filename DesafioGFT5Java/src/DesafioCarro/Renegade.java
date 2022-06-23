package DesafioCarro;

public class Renegade extends Carro{
	
	private TipoCombustivel tipoCombustivel;
	private final int VELOCIDADE_MAX = 300;
	private int velocidadeAtual;
	
	

	public Renegade() {
		super();
		
	}

	public Renegade(String modelo, String marca) {
		super(modelo, marca);
		
	}

	public Renegade(TipoCombustivel tipoCombustivel, int velocidadeAtual) {
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
		return "Renegade [tipoCombustivel=" + tipoCombustivel + ", VELOCIDADE_MAX=" + VELOCIDADE_MAX
				+ ", velocidadeAtual=" + velocidadeAtual + "]";
	}
	
	

}
