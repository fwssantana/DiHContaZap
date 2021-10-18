package repeticao;

import java.util.Random;
import java.util.Scanner;

public class Teste {


	public static void main(String[] args) {

		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(6) + 5;
		
		System.out.println("Tente adivinhar o número! (5 a 10)");

		Scanner entrada = new Scanner(System.in);
		int tentativa = entrada.nextInt();

		while(tentativa != numeroAleatorio) {
			System.out.println("Tente novamente!");
			tentativa = entrada.nextInt();
		}

		System.out.println("PARABENS!!!");
	}
}
