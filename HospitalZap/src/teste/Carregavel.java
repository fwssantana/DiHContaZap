package teste;

public interface Carregavel {

	
	default public String verificaCarga(Bateria bateria) {
		if (bateria.getNivelBateria() == 100) {
			return "Bateria est� carregada!";
		}
		
		return "Bateria est� carregando!";
	}
	
//	public String verificaCarga(Bateria bateria);
	
}
