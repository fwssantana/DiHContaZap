package teste;

public class CarroEletrico implements Carregavel {

	private Bateria bateria;

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public String verificaCarga(Bateria bateria) {
		Carregavel.super.verificaCarga(bateria);
		return null;
	}
	
}
