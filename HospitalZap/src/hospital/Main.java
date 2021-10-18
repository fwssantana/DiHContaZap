package hospital;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		
		Funcionario f1 = new Medico();
		f1.setNome("m1");
		f1.setIdade(1);
		f1.setDocumentoConselho("crm1");
		
		Funcionario f2 = new Medico();
		f2.setNome("m2");
		f2.setIdade(2);
		f2.setDocumentoConselho("crm2");
		
		Funcionario f3 = new Enfermeiro();
		f3.setNome("e1");
		f3.setIdade(3);
		f3.setDocumentoConselho("cref1");
		
		Funcionario f4 = new Enfermeiro();
		f4.setNome("e2");
		f4.setIdade(4);
		f4.setDocumentoConselho("cref2");
		
		Set<Funcionario> funcionarios = new HashSet<Funcionario>();
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		hospital.setFuncionarios(funcionarios);
		
		
		Set<Funcionario> funcionariosDoHospital = hospital.getFuncionarios();
		
		
		for (Funcionario funcionario : funcionariosDoHospital) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getIdade());
			System.out.println(funcionario.getDocumentoConselho());
		}
	}
	
}
