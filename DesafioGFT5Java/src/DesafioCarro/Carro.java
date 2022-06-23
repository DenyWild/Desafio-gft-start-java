package DesafioCarro;

public class Carro {

	private String modelo;
	private String marca;

	public Carro() {
		this.modelo = "";
		this.marca = "";
	}

	public Carro(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
