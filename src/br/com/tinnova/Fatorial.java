package br.com.tinnova;

public class Fatorial {

	private static Long fatorial;

	public static Long calcularFatorial(Long numero) {
		fatorial = 1L;
		if (numero < 0) {
			throw new IllegalArgumentException("Não existe fatorial de numeros negativos");
		} else if (numero <= 1) {
			return fatorial;
		} else {
			for (int i = 2; i <= numero; i++)
				fatorial *= i;
			return fatorial;
		}

	}

	public static void main(String[] args) {

		System.out.println("0 != " + calcularFatorial(0L));
		System.out.println("1 != " + calcularFatorial(1L));
		System.out.println("2 != " + calcularFatorial(2L));
		System.out.println("3 != " + calcularFatorial(3L));
		System.out.println("4 != " + calcularFatorial(4L));
		System.out.println("5 != " + calcularFatorial(5L));
		System.out.println("6 != " + calcularFatorial(6L));

	}

}
