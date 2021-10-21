package teste;

public interface Carregavel {

	
	default public String verificaCarga(Bateria bateria) {
		if (bateria.getNivelBateria() == 100) {
			return "Bateria está carregada!";
		}
		
		return "Bateria está carregando!";
	}
	
//	public String verificaCarga(Bateria bateria);
	
}
