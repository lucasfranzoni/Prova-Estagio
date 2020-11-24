package br.com.scc4.provaestagiario.calculadora;

public class MMC {

	private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
}
