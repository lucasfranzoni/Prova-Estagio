package br.com.scc4.provaestagiario.calculadora;

public class Calculadora {

	public static Fracao soma(Fracao f1, Fracao f2) {
		int denominador = MMC.mmc(f1.getDenominador(), f2.getDenominador());
		int numerador = ((denominador/f1.getDenominador())*f1.getNumerador()) + ((denominador/f2.getDenominador())*f2.getNumerador());
		return new Fracao(numerador, denominador);
	}
	
	public static Fracao subtracao(Fracao f1, Fracao f2) {
		int denominador = MMC.mmc(f1.getDenominador(), f2.getDenominador());
		int numerador = ((denominador/f1.getDenominador())*f1.getNumerador()) - ((denominador/f2.getDenominador())*f2.getNumerador());
		return new Fracao(numerador, denominador);
	}
	
	public static Fracao multiplicacao(Fracao f1, Fracao f2) {
		int numerador = f1.getNumerador() * f2.getNumerador();
		int denominador = f1.getDenominador() * f2.getDenominador();
		return new Fracao(numerador, denominador);
	}
	
	public static Fracao divisao(Fracao f1, Fracao f2) {
		int numerador = f1.getNumerador() * f2.getDenominador();
		int denominador = f1.getDenominador() * f2.getNumerador();
		return new Fracao(numerador, denominador);
	}
}
