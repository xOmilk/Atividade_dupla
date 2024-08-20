package Atv_estudo_de_caso;

public class Avaliacao {
	private String tipo;
    private int peso;
    private double notaFinal;

    public Avaliacao(String tipo, int peso, double nota) {
        this.tipo = tipo;
        this.peso = peso;
        this.notaFinal = nota;
    }

    public Avaliacao(String tipo, int peso, double nota1, double nota2, double nota3) {
        this.tipo = tipo;
        this.peso = peso;
        this.notaFinal = (nota1 + nota2 + nota3) / 3.0;
    }

    public Avaliacao(String tipo, int peso, double nota1, double nota2, double nota3, double nota4) {
        this.tipo = tipo;
        this.peso = peso;
        this.notaFinal = (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularPontos() {
        return notaFinal * peso;
    }
}
