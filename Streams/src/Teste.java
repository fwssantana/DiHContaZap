import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(Sexo.MASCULINO, "Francisco", 33));
		pessoas.add(new Pessoa(Sexo.MASCULINO, "Igor", 37));
		pessoas.add(new Pessoa(Sexo.FEMININO, "Rafa", 32));
		pessoas.add(new Pessoa(Sexo.FEMININO, "Trufa", 1));
		
		Map<Sexo, List<String>> nomesPorSexo = 
			pessoas
				.stream()
				.filter(entidade -> entidade.getIdade() > 18)
				.collect(
					Collectors.groupingBy(Pessoa::getSexo, 
							Collectors.mapping(Pessoa::getNome, Collectors.toList())
					)
				);
		
		
		Set<Sexo> keySet = nomesPorSexo.keySet();
		for (Sexo sexo : keySet) {
			Collections.sort(nomesPorSexo.get(sexo), Comparator<>.comp);
		}
		System.out.println(nomesPorSexo);
		
	}
	
}
