package repeticao;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		System.out.println("Digite um palindromo");
		Scanner entrada = new Scanner(System.in);
		String tentativa = entrada.nextLine();

		String palavraInvertida = "";
		
		for (int i = tentativa.length() - 1; i >= 0; i--) {
			palavraInvertida += tentativa.charAt(i);
		}
		
		if (palavraInvertida.equalsIgnoreCase(tentativa)) {
			System.out.println("? um palindromo!");
		} else {
			System.out.println("Hoje n?o. =(");
		}
	}
	
}
