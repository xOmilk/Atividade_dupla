package Atv_estudo_de_caso;

public class Main {
	 public static void main(String[] args) {
	       
	        Avaliacao prova1 = new Avaliacao("Prova", 2, 7.0);
	        Avaliacao prova2 = new Avaliacao("Prova", 2, 8.0);

	        Avaliacao trabalho = new Avaliacao("Trabalho", 1, 6.0, 7.0, 8.0);

	        Avaliacao interdisciplinar = new Avaliacao("Interdisciplinar", 2, 5.0, 6.0, 7.0, 9.0);

	     
	        Semestre semestre = new Semestre();
	        semestre.adicionarAvaliacoes(prova1, prova2, trabalho, interdisciplinar);

	   
	        if (!semestre.validarPesos()) {
	            System.out.println("Erro: A soma dos pesos das avaliações não é igual a 7.");
	            return;
	        }

	        System.out.println("Média Final: " + semestre.calcularMediaFinal());
	        System.out.println("Resultado: " + semestre.verificarAprovacao());
	    }
}
