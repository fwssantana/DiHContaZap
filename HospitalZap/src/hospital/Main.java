package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import exception.AgendamentoInvalidoException;

public class Main {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();

		
		Funcionario f1 = new Medico();
		f1.setNome("Andre");
		f1.setIdade(4);
		f1.atribuirDocumentoConselho("crm1");
		
		Funcionario f2 = new Enfermeiro();
		f2.setNome("Andre");
		f2.setIdade(3);
		f2.atribuirDocumentoConselho("cref2");
		System.out.println(f2.getTipoFuncionario());
		
		System.out.println(TipoFuncionario.ENFERMEIRO.equals(f2.getTipoFuncionario()));
		
		Funcionario f3 = new Enfermeiro();
		f3.setNome("Pedro");
		f3.setIdade(2);
		f3.atribuirDocumentoConselho("cref1");
		
		Funcionario f4 = new Enfermeiro();
		f4.setNome("Marcela");
		f4.setIdade(1);
		f4.atribuirDocumentoConselho("cref2");

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f3);
		funcionarios.add(f2);
		funcionarios.add(f4);
		funcionarios.add(f1);

		Consulta c1 = new Consulta();
		try {
			c1.setDataAgendamento(LocalDate.now());
		} catch (AgendamentoInvalidoException e) {
			System.out.println("Opa! Data inválida!");
		}
		
//		Comparator<Funcionario> comparadorFuncionario = Comparator.comparing(Funcionario::getIdade)
//			.thenComparing(Funcionario::getNome)
//			.thenComparing(Funcionario::getTipoFuncionario);
//		
//		funcionarios.sort(comparadorFuncionario);
//		
//		
		for (Funcionario funcionario : funcionarios) {
			System.out.print(funcionario.getEspecialidade());
		}
		
		List<Funcionario> enfermeiros = new ArrayList<Funcionario>();
		
		
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getTipoFuncionario().equals(TipoFuncionario.ENFERMEIRO)) {
				enfermeiros.add(funcionario);
			}
		}
		
		
		List<String> listaDeEnfermeiros = funcionarios.stream()
			.filter(funcionario -> TipoFuncionario.ENFERMEIRO.equals(funcionario.getTipoFuncionario()))
			.map(funcionario -> funcionario.getNome())
			.collect(Collectors.toList());
		
		for (String funcionario : listaDeEnfermeiros) {
			System.out.println(funcionario);
		}

		String x = null;
		System.out.println(x.charAt(0));
		
	}
	
}
