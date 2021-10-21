package hospital;

import java.util.Comparator;

public class ComparadorFuncionarioIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		return o1.getIdade().compareTo(o2.getIdade());
	}

}
