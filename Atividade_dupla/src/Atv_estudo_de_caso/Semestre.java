package Atv_estudo_de_caso;

public class Semestre {
	 	private Avaliacao avaliacao1;
	    private Avaliacao avaliacao2;
	    private Avaliacao avaliacao3;
	    private Avaliacao avaliacao4;

	    public void adicionarAvaliacoes(Avaliacao avaliacao1, Avaliacao avaliacao2, Avaliacao avaliacao3, Avaliacao avaliacao4) {
	        this.avaliacao1 = avaliacao1;
	        this.avaliacao2 = avaliacao2;
	        this.avaliacao3 = avaliacao3;
	        this.avaliacao4 = avaliacao4;
	    }

	    public boolean validarPesos() {
	        double somaPesos = avaliacao1.getPeso() + avaliacao2.getPeso() + avaliacao3.getPeso() + avaliacao4.getPeso();
	        return somaPesos == 7;
	    }

	    public double calcularMediaFinal() {
	        double somaPontos = avaliacao1.calcularPontos() + avaliacao2.calcularPontos() + avaliacao3.calcularPontos() + avaliacao4.calcularPontos();
	        return somaPontos / 7.0;
	    }

	    public String verificarAprovacao() {
	        return calcularMediaFinal() >= 5.0 ? "APROVADO" : "REPROVADO";
	    }
}
