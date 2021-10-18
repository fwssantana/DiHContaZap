package hospital;

public class Medico extends Funcionario {

	private String crm;

	public Medico() {
		super(TipoFuncionario.MEDICO);
	}

	@Override
	public void setDocumentoConselho(String documento) {
		this.crm = documento;
	}
	
	@Override
	public String getDocumentoConselho() {
		return this.crm;
	}
}
