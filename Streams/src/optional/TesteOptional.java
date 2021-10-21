package optional;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {

		String stringNaoNula = "Oi!";
		String stringNula = null;
		Optional<String> stringOpcional = Optional.ofNullable(stringNula);
		
		System.out.println(stringOpcional.orElse("Ih, estava vazio!"));
//		System.out.println(stringOpcional.orElse("stringVazia")); 
	}
	
}
