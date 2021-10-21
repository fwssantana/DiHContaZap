package hospital;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Paciente {

	@Setter(AccessLevel.NONE) private String nomeDoPaciente;
	private int idade;
	private String genero;
	private String documento;

}
