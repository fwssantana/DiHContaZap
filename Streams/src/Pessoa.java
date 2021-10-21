
public class Pessoa {

	private Sexo sexo;
	private String nome;
	private Integer idade;
	
	
	public Pessoa(Sexo sexo, String nome, Integer idade) {
		this.sexo = sexo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
