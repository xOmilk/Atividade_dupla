package Exercicio_de_autorevisao;

public class Tratandoexcecoes_q9 {
	public static void main(String[]args) {
		
		
		/*FORMA COM ERRO
		try {
			
			int i=2/0;
		}catch(Exception e) {
			System.out.println("TRATANDO ERRO DE EXCEPTION"+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("TRATANDO ERRO DE ARITHMETICEXCEPTION"+e.getMessage());
		}*/
		
		//FORMA CORRETA
		try {
			
			int i=2/0;
		}catch(ArithmeticException e) {
			System.out.println("TRATANDO ERRO DE ARITHMETICEXCEPTION"+e.getMessage());
		}catch(Exception e) {
			System.out.println("TRATANDO ERRO DE EXCEPTION"+e.getMessage());
		}
		
		
		
		
	}

}
