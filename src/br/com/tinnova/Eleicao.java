package br.com.tinnova;

public class Eleicao {

	private Long votosValidos;
	private Long votosBrancos;
	private Long votosNulos;

	public Eleicao() {
	}

	public Eleicao(Long votosValidos, Long votosBrancos, Long votosNulos) {
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}

	public Long getVotosValidos() {
		return votosValidos;
	}

	public void setVotosValidos(Long votosValidos) {
		this.votosValidos = votosValidos;
	}

	public Long getVotosBrancos() {
		return votosBrancos;
	}

	public void setVotosBrancos(Long votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	public Long getVotosNulos() {
		return votosNulos;
	}

	public void setVotosNulos(Long votosNulos) {
		this.votosNulos = votosNulos;
	}

	public Long totalEleitores() {
		return this.votosBrancos + this.getVotosNulos() + this.votosValidos;
	}

	public Double percentualVotosValidos() {
		return ((double) this.votosValidos / (double) totalEleitores());
	}

	public Double percentualVotosBrancos() {
		return ((double) this.votosBrancos / (double) totalEleitores());
	}

	public Double percentualVotosNulos() {
		return ((double) this.votosNulos / (double) totalEleitores());
	}

	public static void main(String[] args) {
		Eleicao eleicao = new Eleicao(800L, 150L, 50L);
		
		System.out.println("Eleições 2022:");
		System.out.printf("Total de votos validos...... %d (%.2f%%) \n", eleicao.getVotosValidos(), eleicao.percentualVotosValidos() * 100);
		System.out.printf("Total de votos brancos...... %d (%.2f%%) \n", eleicao.getVotosBrancos(), eleicao.percentualVotosBrancos() * 100);
		System.out.printf("Total de votos nulos........  %d ( %.2f%%) \n", eleicao.getVotosNulos(), eleicao.percentualVotosNulos() * 100);
		System.out.printf("Total de eleitores..........%d", eleicao.totalEleitores());
	}

}
