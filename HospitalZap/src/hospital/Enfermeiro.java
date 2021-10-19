package hospital;

public class Enfermeiro extends Funcionario {

	private String cref;

	public Enfermeiro() {
		super(TipoFuncionario.ENFERMEIRO);
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	@Override
	public String obterDocumentoConselho() {
		return this.cref;
	}

	@Override
	public void atribuirDocumentoConselho(String documento) {
		this.cref = documento;
	}
	
}
