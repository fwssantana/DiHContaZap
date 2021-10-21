package lambda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Calculadora {

//	public double opera(double a, double b, OperacaoMatematica operacao) {
//		return operacao.operacaoMatematica(a, b);
//	}
	
//	public double opera(int a, int b, OperacaoMatematica operacao) {
//		return operacao.operacaoMatematica(a, b);
//	}
	public int opera(int a, int b, OperacaoMatematica operacao) throws FileNotFoundException {
		FileInputStream fileIS = new FileInputStream("arquivo");
		return operacao.operacaoMatematica(a, b);
	}

	public static void main(String[] args) {
//		OperacaoMatematica adicao = (double a, double b) -> a + b;
//		OperacaoMatematica sub = (double a, double b) -> a - b;
		OperacaoMatematica div = (int a, int b) -> a / b;
		
		
		try {
			
		Integer a = 10;
		Integer b = 0;
		
		try {
			// abri conexão com o banco
			// tentei executar minha consulta
			double resultadoOperacao = new Calculadora().opera(a, b, div);
			System.out.println(resultadoOperacao);
		} catch (ArithmeticException | NullPointerException e) {
			// encontrei um erro
			System.out.println("Divisão por 0!");
		} catch (Exception e) {
			System.out.println("Agora tá tudo tratado");
		} finally {
			// fechei minha conexão com o banco
			System.out.println("E executa isso aqui!");
		}
		
		} catch (Exception e) {
			System.out.println("ih, deu ruim!");
		}
		System.out.println("E executa isso aqui!");
	}

}
