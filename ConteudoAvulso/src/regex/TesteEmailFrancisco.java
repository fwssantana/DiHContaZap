package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteEmailFrancisco {

	public static void main(String[] args) {
		
		
		// Qualquer caracter entre a-zA-Z
		// Seguido de qualquer "NÃO @" 0 ou mais vezes
		// Seguido de um @
		// Seguido de qualquer "word caracter" 1 ou mais vezes
		// Seguido de ponto
		// Seguido de qualquer "word caracter" 1 ou mais vezes
		// Seguido de 0 ou mais blocos que obedecam o padrão: ponto + qualquer caracter 1 ou mais vezes
		
//		String pattern = "[a-zA-Z]"
//				+ [^@]"
//				+ "@"
//				+ "[\\w]+"
//				+ "\\."
//				+ "[\\w]+"
//				+ "(\\.[\\w]+)*";
//		
		String pattern = "[a-zA-Z][^@]*@[\\w]+\\.[\\w]+(\\.[\\w]+)*";
		Pattern email = Pattern.compile(pattern);
		String teste = "francisco.santana@edu.sc.senai.br";
		Matcher matcher = email.matcher(teste);
		System.out.println(matcher.matches());
		System.out.println(matcher.group(0));

		matcher = email.matcher("francisco.santana@edu.sc@senai.br");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("fra@ncisco.santana@edu.scsenai.br");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("francisco.santana@");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("francisco.santana@.");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("francisco.santana@edu");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("francisco.santana@edu.");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
		
		matcher = email.matcher("francisco.santana@edu.sc");
		if (matcher.matches()) {
			System.out.println(matcher.group(0));
		}
	}
	
}
