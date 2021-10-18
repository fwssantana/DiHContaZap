package hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hospital {

	private List<Paciente> pacientes;
	private Set<Funcionario> funcionarios;
	private Map<String, Set<Paciente>> pacientesPorQuarto;
	
	public Hospital() {
		this.pacientes = new ArrayList<Paciente>();
		this.funcionarios = new HashSet<Funcionario>();
		this.pacientesPorQuarto = new HashMap<String, Set<Paciente>>();
	}
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Set<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Map<String, Set<Paciente>> getPacientesPorQuarto() {
		return pacientesPorQuarto;
	}
	
}
