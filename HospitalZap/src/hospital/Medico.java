package hospital;

public class Medico extends Funcionario {

	private String crm;

	public Medico() {
		super(TipoFuncionario.MEDICO);
	}

	@Override
	public void atribuirDocumentoConselho(String documento) {
		this.crm = documento;
	}
	
	@Override
	public String obterDocumentoConselho() {
		return this.crm;
	}
	
}
