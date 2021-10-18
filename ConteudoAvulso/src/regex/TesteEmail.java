package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteEmail {

	public static void main(String[] args) {

//		| OU
		
//		^
//		\d	A digit: [0-9]
//		\D	A non-digit: [^0-9]
//		\s	A whitespace character: [ \t\n\x0B\f\r]
//		\S	A non-whitespace character: [^\s]
//		\w	A word character: [a-zA-Z_0-9]
//		\W	A non-word character: [^\w]
		
		// . <-- casa com algum caracter
		// * <-- 0 ou mais vezes
		// + <-- 1 ou mais vezes
		// a, b, 1, @, _, ...<-- casa com esse caracter
		// () <-- grupos
		
//		comeca com um uma letra,
//		pode ter vários caracteres.
//		em algum momento vai ter um arroba.
//		varios caracteres separados com .
//		não pode terminar com um caracter especial.
		
		
		
		String email3 = " @algo.com.br";
		String teste = "1@algo.a";
		
		Pattern padraoEmail = Pattern.compile("[^@|^\\D]\\D[^\\s]*@.+");
		Matcher matcher = padraoEmail.matcher(email3);
//		System.out.println(matcher.find());

		
		Pattern padraoEmail2 = Pattern.compile("([^@^\\s].*)@([^@^\\s]+\\.[^@^\\s]+)");

		String telefone = "(21)99989-0000000000";
		Pattern padraoTeste = Pattern.compile("\\((\\d{2})\\)(\\d{5}-\\d{4})");
		Matcher matcher2 = padraoTeste.matcher(telefone);
		matcher2.matches();
		System.out.println(matcher2.group(0));
		System.out.println(matcher2.group(1));
		System.out.println(matcher2.group(2));
		
//		Pattern padraoTelefone = Pattern.compile("(\\d{2})(\\d{5}d{4})");
//		Matcher matcher2 = padraoTelefone.matcher(telefone);
//		matcher2.matches();
//		System.out.println(matcher2.group(0));
//		System.out.println(matcher2.group(1));
//		System.out.println(matcher2.group(2));
	}
	
}
