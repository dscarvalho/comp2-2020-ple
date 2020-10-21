package br.ufrj.dcc.comp2.ple.aula_danilo.aula23.enums;

public class ExemploEnum {

	public static void main(String[] args) {
		//System.out.println(DiaDaSemana.SABADO);
		
		for (DiaDaSemana dia : DiaDaSemana.values()) {
			System.out.println(dia);
		}
	}

}
