package DesafioCarro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

int quantidadeCarros = 0;
int carrosDiesel = 0;
int carrosGasolina = 0;
		
		do {
			quantidadeCarros++;
			
			Carro carro = new Ferrari("lala", 5);
			
			System.out.println("Informe o modelo do carro: ");
			carro.setModelo(input.nextLine());
			
			System.out.println("Informe a marca do carro: ");
			carro.setMarca(input.nextLine());
			
			System.out.println("Informe o tipo de combustível do carro :");
			String combustivel = input.nextLine();
			
			if(combustivel.equalsIgnoreCase("diesel")) {
				carrosDiesel++;
			}else if(combustivel.equalsIgnoreCase("gasolina")) {
				carrosGasolina++;
			}
			
			
		}while(quantidadeCarros <= 5);
		
		System.out.println(" Carros movidos a diesel: "+carrosDiesel);
		System.out.println("Carros movidos a gasolina: "+carrosGasolina);

	}

}
