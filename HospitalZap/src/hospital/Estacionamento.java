package hospital;

public class Estacionamento implements Faturavel {

	public static final Double precoHora = 8.0;

	private Integer horas;
	
	@Override
	public Double getPreco() {
		return horas * precoHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
}
