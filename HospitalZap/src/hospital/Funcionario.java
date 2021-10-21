package hospital;

public abstract class Funcionario implements Comparable<Funcionario> {

	private Integer idade;
	private String nome;
	private String especialidade;
	private TipoFuncionario tipoFuncionario;
	
	
	public Funcionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
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

	
	@Override
	public int compareTo(Funcionario o) {
		int comparacao = this.getNome().compareTo(o.getNome());
		if (comparacao != 0) {
			if (this.getIdade() == o.getIdade()) {
				
			}
		}
		return comparacao;
	}
	
}
