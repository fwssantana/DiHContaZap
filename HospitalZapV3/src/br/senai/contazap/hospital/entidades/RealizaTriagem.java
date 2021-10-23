package br.senai.contazap.hospital.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.senai.contazap.hospital.HospitalZap;

public interface RealizaTriagem {

	default public List<ServicoHospitalar<?>> realizaTriagem(Paciente paciente) {
		// medir pressão, fazer diagnóstico preliminar
		ArrayList<ServicoHospitalar<?>> servicos = new ArrayList<ServicoHospitalar<?>>();
		if(paciente.getNome().equalsIgnoreCase("teste")) {
			servicos.add(new Consulta());
			servicos.add(new Exame());
		} else {
			servicos.add(new Exame());
		}
		
		Optional<ProfissionalSaude> medico = HospitalZap.profissionaisSaude
			.stream()
			.filter(profissional -> {
				return profissional.getDisponivel() 
						&& TipoProfissionalSaude.MEDICO.equals(profissional.getTipoProfissional());	
			})
			.findFirst();
		
		return servicos;
	}
	
}
