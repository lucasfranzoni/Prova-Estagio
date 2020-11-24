package br.com.scc4.provaestagiario.calculadora;

public class Fracao {

	private int numerador;
	private int denominador;
	
	public Fracao(int  numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		return numerador + "/" + denominador;
	}
}
