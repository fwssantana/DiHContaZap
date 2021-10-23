package br.senai.contazap.hospital;

import java.util.List;

import br.senai.contazap.hospital.entidades.Paciente;
import br.senai.contazap.hospital.entidades.ServicoHospitalar;
import br.senai.contazap.hospital.entidades.TipoAtendimento;

public class Recepcao {

	public List<ServicoHospitalar<?>> atendePaciente(Paciente p, TipoAtendimento tipoAtendimento) {
		
		if(TipoAtendimento.CONVENIO.equals(tipoAtendimento)) {
			// Valida com o plano de saude
		} 
		
		return Triagem.getProfissionalTriagem().realizaTriagem(p);
	}
	
}
