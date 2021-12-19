package br.com.tinnova;

public class BubbleSort {

	private int[] vetor;
	private int interacao;
	private int posicoesPercorrer;

	public BubbleSort() {
	}

	public BubbleSort(int[] vetor) {
		this.vetor = vetor;
		this.interacao = 0;
		this.posicoesPercorrer = vetor.length - 1;
	}

	public int[] getVetor() {
		return vetor;
	}

	public int getInteracao() {
		return interacao;
	}

	public int getPosicoesPercorrer() {
		return posicoesPercorrer;
	}

	public void setPosicoesPercorrer(int posicoesPercorrer) {
		this.posicoesPercorrer = posicoesPercorrer;
	}

	public void sort() {
		for (int i = 0; i < posicoesPercorrer; i++) {
			if (this.vetor[i] > this.vetor[i + 1]) {
				int n = this.vetor[i];
				this.vetor[i] = this.vetor[i + 1];
				this.vetor[i + 1] = n;
			}
		}
		interacao++;

	}

	public static void main(String[] args) {
		int[] vetor = { 5, 3, 2, 4, 7, 1, 0, 6 };
		BubbleSort bubbleSort = new BubbleSort(vetor);

		bubbleSort.sort();
		System.out.printf("\n interacao %d:", bubbleSort.getInteracao());
		for (int n : bubbleSort.getVetor())
			System.out.print(" " + n);

		bubbleSort.setPosicoesPercorrer(6);
		bubbleSort.sort();
		System.out.printf("\n interacao %d:", bubbleSort.getInteracao());
		for (int n : bubbleSort.getVetor())
			System.out.print(" " + n);

	}

}
