package br.ufrj.dcc.comp2.ple.aula_danilo.lab7;

import java.io.Serializable;

public class ParOrdenado<T extends Number> implements Serializable {
	private static final long serialVersionUID = 2020L;
	private T x;
	private T y;

	public ParOrdenado(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + String.valueOf(x) + ", " + String.valueOf(y) + ")";
	}

	/**
	 * @return the x
	 */
	public T getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(T x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public T getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(T y) {
		this.y = y;
	}
	
	
}
