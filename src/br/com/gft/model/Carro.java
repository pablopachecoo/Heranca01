package br.com.gft.model;

import br.com.gft.model.Veiculo;

public class Carro extends Veiculo {

	private String Marca;
	private int Portas;
	private int Ano;

	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, int ano) {
		super(modelo, velocidade, passageiros, combustivel);
		Marca = marca;
		Portas = portas;
		Ano = ano;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getPortas() {
		return Portas;
	}

	public void setPortas(int portas) {
		Portas = portas;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}
}