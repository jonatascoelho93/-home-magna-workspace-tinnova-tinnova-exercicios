package br.com.tinnova;

public class Multiplos {

	public static Long somaMultiplos3e5(Long numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("Não existe fatorial de numeros negativos");
		} else {
			Long soma = 0L;
			for (long i = 0; i < numero; i++) {
				if (i % 3 == 0 || i % 5 == 0)
					soma += i;
			}
			return soma;

		}

	}

	public static void main(String[] args) {
		System.out.println(somaMultiplos3e5(10L));

	}

}
