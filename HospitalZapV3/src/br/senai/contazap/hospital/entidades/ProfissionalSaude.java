package br.senai.contazap.hospital.entidades;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public abstract class ProfissionalSaude extends Pessoa {

	@Setter(AccessLevel.NONE) private TipoProfissionalSaude tipoProfissional;
	private Boolean disponivel;
	
	public ProfissionalSaude(TipoProfissionalSaude tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}
	
}
