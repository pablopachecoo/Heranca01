package br.com.gft.main;

// importar o scanner para input do usu�rio
import java.util.Scanner;

//importar o carro e o avi�o, se n�o n�o tem como instanciar
import br.com.gft.model.Aviao;
import br.com.gft.model.Carro;

public class Main {

	public static void main(String[] args) {
		String escolha;
		Scanner sc = new Scanner(System.in);

		Carro fusca = new Carro("Fusca", 50, 4, 30, "Volkswagen", 2, 1990);
		Carro ferrari = new Carro ("F800", 300, 4, 40, "Ferrari", 2, 2019);
		Carro golf = new Carro ("Golf MK1", 110, 4, 20, "Volkswagen", 2, 1975);
		Aviao fic = new Aviao("Generico", 1000, 200, 500, "Comercial", "Transporte de Pessoas");
		Aviao con = new Aviao("Concorde", 2469,100, 600, "Super S�nico", "Voar");
		Aviao b29 = new Aviao("B-29 Superfortress", 574, 11, 300, "Bombardeiro Estrat�gico", "Explodir Coisas");
		System.out.println("digite /infocarros para ver as informa��es do carro" + "\n"
				+ "digite /infoaviao para ver informa��es do avi�o");

		while (true) {
			escolha = sc.nextLine();
			switch (escolha) {
				//LISTA DOS CARROS//
			case "/infocarros":
				System.out.println("Escolha qual Carro voc� deseja ver as informa��es " + "\n" + ferrari.getModelo() + "\n" + fusca.getModelo() + "\n" + golf.getModelo());
				break;
				
				// LISTA DOS AVI�ES//
			case "/infoaviao":
				System.out.println("Escolha qual Avi�o voc� deseja ver as informa��es " + "\n" + fic.getModelo() + "\n" + con.getModelo() + "\n" + b29.getModelo());
				break;
				
				// Volkswagen Fusca//
			case "Fusca" :
				System.out.println("Ano: " + fusca.getAno() + "\n" + "Combust�vel: " + fusca.getCombustivel() + "L"
						+ "\n" + "Fabricante: " + fusca.getMarca() + "\n" + "Modelo: " + fusca.getModelo() + "\n"
						+ "Portas: " + fusca.getPortas());
				break;
				
				// FERRARI F800//
			case "F800" :
				System.out.println("Ano: " + ferrari.getAno() + "\n" + "Combust�vel: " + ferrari.getCombustivel() + "L"
						+ "\n" + "Fabricante: " + ferrari.getMarca() + "\n" + "Modelo: " + ferrari.getModelo() + "\n"
						+ "Portas: " + ferrari.getPortas());
				break;
				
			case "Golf MK1" :
				System.out.println("Ano: " + golf.getAno() + "\n" + "Combust�vel: " + golf.getCombustivel() + "L"
						+ "\n" + "Fabricante: " + golf.getMarca() + "\n" + "Modelo: " + golf.getModelo() + "\n"
						+ "Portas: " + golf.getPortas());					
				break;
			case "Golf" :
				System.out.println("Ano: " + golf.getAno() + "\n" + "Combust�vel: " + golf.getCombustivel() + "L"
						+ "\n" + "Fabricante: " + golf.getMarca() + "\n" + "Modelo: " + golf.getModelo() + "\n"
						+ "Portas: " + golf.getPortas());					
				break;		
			case "Generico" :
				System.out.println("Tipo: " + fic.getTipo() + "\n" + "Uso: " + fic.getUso());
				break;
			case "Concorde" :
				System.out.println("Tipo: " + con.getTipo() + "\n" + "Uso: " + con.getUso());
				break;
			case "B-29 Superfortress" :
				System.out.println("Tipo: " + b29.getTipo() + "\n" + "Uso: " + b29.getUso());
				break;		
			case "B-29":
				System.out.println("Tipo: " + b29.getTipo() + "\n" + "Uso: " + b29.getUso());
				break;		
			}

		}
	}

}