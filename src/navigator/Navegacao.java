package navigator;

import java.util.Scanner;

import route.Carro;
import route.Metro;
import route.Onibus;
import route.Pedestre;
import route.Rota;

public class Navegacao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String entrada;
		
		Rota rota;
		
		boolean fimDoTrajeto = false;
		
		while (fimDoTrajeto == false) {
			
			System.out.println("Escolha o transporte para o trajeto:");
			System.out.println("1 - Pedestre");
			System.out.println("2 - Carro");
			System.out.println("3 - Ônibus");
			System.out.println("4 - Metrô");
			System.out.println("5 - Sair");
			
			entrada = scan.nextLine();
			
			if (entrada.equalsIgnoreCase("1")) {
				rota = new Pedestre();
				
			} else if (entrada.equalsIgnoreCase("2")) {
				rota = new Carro();
				
			} else if (entrada.equalsIgnoreCase("3")) {
				rota = new Onibus();
				
			} else if (entrada.equalsIgnoreCase("4")) {
				rota = new Metro();
				
			} else if (entrada.equalsIgnoreCase("5")){
				System.out.println("Encerrando navegação. Até logo!");
				fimDoTrajeto = true;
			} else {
				System.out.println("Transporte não cadastrado no sistema.");
			}
			
			rota.calcularRota();
		}
		
		scan.close();
	}

}
