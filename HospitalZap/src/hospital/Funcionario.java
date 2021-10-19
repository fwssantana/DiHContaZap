package hospital;

public abstract class Funcionario {

	private int idade;
	private String nome;
	private String especialidade;
	private TipoFuncionario tipoFuncionario;
	
	
	public Funcionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public final String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public abstract String obterDocumentoConselho();
	public abstract void atribuirDocumentoConselho(String documento);
}
