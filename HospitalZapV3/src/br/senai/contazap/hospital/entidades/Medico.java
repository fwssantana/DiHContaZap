package br.senai.contazap.hospital.entidades;

public class Medico extends ProfissionalSaude implements RealizaTriagem {

	public Medico() {
		super(TipoProfissionalSaude.MEDICO);
	}

}
