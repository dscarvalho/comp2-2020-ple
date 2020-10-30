package br.ufrj.dcc.comp2.ple.aula_danilo.lab4.lista1.exercicio1;

import java.util.Scanner;

public class CalculaMedia {
	protected final int a;
	
	public CalculaMedia(int a) {
		this.a = a;
	}
	
	public static double leNumero(Scanner scanner) {
		double numero = Double.NaN;
		if (scanner.hasNextDouble()) {
			numero = scanner.nextDouble();
		}
		else {
			System.err.println("Erro: Número inválido!");
			scanner.nextLine();
		}
		
		return numero;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números:");
		
		int tamanhoLista = (int)CalculaMedia.leNumero(scanner);
		while (tamanhoLista <= 0 || tamanhoLista == Double.NaN) {
			System.out.println("Digite a quantidade de números:");
			tamanhoLista = (int)CalculaMedia.leNumero(scanner);
		}
		
		System.out.println("Digite os números um por linha:");
		
		int numerosLidos = 0;
		double acumulador = 0;
		while (numerosLidos < tamanhoLista) {
			double numero = CalculaMedia.leNumero(scanner);
			
			if (!Double.isNaN(numero)) {
				acumulador += numero;
				numerosLidos++;
			}
		}
		
		double media = acumulador / tamanhoLista;
		
		System.out.println(media);
	}
}
