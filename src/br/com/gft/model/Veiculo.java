package br.com.gft.model;

import br.com.gft.main.Main;;

public class Veiculo extends Main {
	protected String Modelo;
	protected int Velocidade;
	protected int Passageiros;
	protected int Combustivel;

	public Veiculo(String modelo, int velocidade, int passageiros, int combustivel) {
		Modelo = modelo;
		Velocidade = velocidade;
		Passageiros = passageiros;
		Combustivel = combustivel;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public int getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(int passageiros) {
		Passageiros = passageiros;
	}

	public int getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(int combustivel) {
		Combustivel = combustivel;
	}

}
