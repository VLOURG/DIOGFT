package one.digitalinnovation.basecamp;

public class Main {
	
	public static void main(String[] args) {
		//Calculadora
		System.out.println("Exercício calculadora");
		Calculadora.soma(3,6);
		Calculadora.subtracao(6,6);
		Calculadora.multiplicacao(3,6);
		Calculadora.divisao(6,6);
		
		//Mensagem
		System.out.println("Exercício mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Empréstimo
		System.out.println("Exercício mensagem");
		Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular( 1000, 5);
				
	}
	
}
