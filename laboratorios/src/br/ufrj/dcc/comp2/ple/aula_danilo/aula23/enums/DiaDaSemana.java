package br.ufrj.dcc.comp2.ple.aula_danilo.aula23.enums;

public enum DiaDaSemana {
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int valor;
	
	private DiaDaSemana(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		switch (this) {
		case SABADO:
		case DOMINGO:
			return super.toString().toLowerCase() + " (" + valor + "º dia da semana)";
		default:
			return super.toString().toLowerCase() + "-feira" + " (" + valor + "º dia da semana)";
		}
	}
}
