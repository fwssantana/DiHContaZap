package hospital;

import java.util.HashSet;
import java.util.Set;

public class Fatura {

	private Set<Faturavel> faturaveis;
	
	public Fatura() {
		faturaveis = new HashSet<Faturavel>();
	}
	
	
	public Double emiteNotaFiscal() {
		Double precoFinal = 0.0;
		for (Faturavel faturavel : faturaveis) {
			precoFinal += faturavel.getPreco();
		}
		
		return precoFinal;
	}
}
