package br.com.gft.model;

import br.com.gft.model.Veiculo;

public class Aviao extends Veiculo {

	private String Tipo;
	private String Uso;

	public Aviao(String modelo, int velocidade, int passageiros, int combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
		Tipo = tipo;
		Uso = uso;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getUso() {
		return Uso;
	}

	public void setUso(String uso) {
		Uso = uso;
	}

}
