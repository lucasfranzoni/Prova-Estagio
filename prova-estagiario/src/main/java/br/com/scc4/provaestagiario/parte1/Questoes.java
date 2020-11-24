package br.com.scc4.provaestagiario.parte1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Questoes {
	
	@GetMapping("/listaReversa")
	public int[] listaReversa(@RequestParam(name="lista") int[] lista) {
		int[] listaReversa = new int[lista.length];
		for (int i = lista.length - 1; i >= 0; i--) {
			listaReversa[lista.length-i-1] = lista[i];
		}
		return listaReversa;
	}
	
	@GetMapping("/imprimirImpares")
	public int[] imprimirImpares(@RequestParam(name="lista") int[] lista) {
		int numerosImpares = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] % 2 == 1) {
				numerosImpares++;
			}
		}
		int[] listaImpares = new int[numerosImpares];
		int contadorImpar = 0;
			
		for (int j = 0; j < lista.length; j++) {
			if(lista[j] % 2 == 1) {
				listaImpares[contadorImpar] = lista[j];
				contadorImpar++;
			}
		}
		return listaImpares;
	}
	
	@GetMapping("/imprimirPares")
	public int[] imprimirPares(@RequestParam(name="lista") int[] lista) {
		int numerosPares = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] % 2 == 0) {
				numerosPares++;
			}
		}
		int[] listaPares = new int[numerosPares];
		int contadorPar = 0;
			
		for (int j = 0; j < lista.length; j++) {
			if(lista[j] % 2 == 0) {
				listaPares[contadorPar] = lista[j];
				contadorPar++;
			}
		}
		return listaPares;
	}
	
	@GetMapping("/tamanho")
	public String tamanho(@RequestParam(name="palavra") String palavra) {
		return "tamanho = " + palavra.length();
	}
	
	@GetMapping("/maiusculas")
	public String maiusculas(@RequestParam(name="palavra") String palavra) {
		return palavra.toUpperCase();
	}
	
	@GetMapping("/vogais")
	public String vogais(@RequestParam(name="palavra") String palavra) {
		String vogais = "";
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
			      vogais += palavra.charAt(i);
			 }
		}
		return vogais;
	}
	
	@GetMapping("/consoantes")
	public String consoantes(@RequestParam(name="palavra") String palavra) {
		String consoantes = "";
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u') {
				consoantes += palavra.charAt(i);
			 }
		}
		return consoantes;
	}
	
	@GetMapping("/nomeBibliografico")
	public String nomeBibliografico(@RequestParam(name="nome") String nome) {
		String[] nomeCompleto = nome.split(" ");
		String nomeBibliografico = nomeCompleto[nomeCompleto.length-1].toUpperCase() + ",";
		for (int i = 0; i < nomeCompleto.length -1; i++) {
			String primeiraLetra = nomeCompleto[i].charAt(0) + "";
			primeiraLetra = primeiraLetra.toUpperCase();
			String outrasLetras = nomeCompleto[i].substring(1);
			outrasLetras = outrasLetras.toLowerCase();
			nomeBibliografico += " " + primeiraLetra + outrasLetras;
		}
		return nomeBibliografico;
	}
	
	
}
