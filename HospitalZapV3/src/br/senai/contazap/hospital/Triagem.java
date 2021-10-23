package br.senai.contazap.hospital;

import br.senai.contazap.hospital.entidades.Enfermeiro;
import br.senai.contazap.hospital.entidades.RealizaTriagem;

public class Triagem {

	private static RealizaTriagem profissionalTriagem;
	
	private Triagem() {
	}

	public static RealizaTriagem getProfissionalTriagem() {
		if (Triagem.profissionalTriagem == null) {
			Triagem.profissionalTriagem = new Enfermeiro();
		}
		
		return profissionalTriagem;
	}

	public static void setProfissionalTriagem(RealizaTriagem profissionalTriagem) {
		Triagem.profissionalTriagem = profissionalTriagem;
	}
	
}
