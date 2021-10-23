package br.senai.contazap.hospital;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.senai.contazap.hospital.entidades.Enfermeiro;
import br.senai.contazap.hospital.entidades.Medico;
import br.senai.contazap.hospital.entidades.Paciente;
import br.senai.contazap.hospital.entidades.ProfissionalSaude;
import br.senai.contazap.hospital.entidades.TipoAtendimento;

public class HospitalZap {

	private Recepcao recepcao;
	public static Set<ProfissionalSaude> profissionaisSaude;
	
	public HospitalZap() {
		this.recepcao = new Recepcao();
		this.inicializaProfissionais();
	}
	
	private void inicializaProfissionais() {
		this.profissionaisSaude = new HashSet<ProfissionalSaude>();
		
		ProfissionalSaude profissionalSaude = new Enfermeiro();
		profissionalSaude.setCpf("teste");
		profissionalSaude.setDataNascimento(LocalDate.now());
		profissionalSaude.setNome("Enfermeiro1");

		ProfissionalSaude profissionalSaude2 = new Enfermeiro();
		profissionalSaude.setCpf("teste");
		profissionalSaude.setDataNascimento(LocalDate.now());
		profissionalSaude.setNome("Enfermeiro2");

		ProfissionalSaude profissionalSaude3 = new Medico();
		profissionalSaude.setCpf("teste");
		profissionalSaude.setDataNascimento(LocalDate.now());
		profissionalSaude.setNome("Medico");
		
		ProfissionalSaude profissionalSaude4 = new Enfermeiro();
		profissionalSaude.setCpf("teste");
		profissionalSaude.setDataNascimento(LocalDate.now());
		profissionalSaude.setNome("Enfermeiro3");
		
		this.profissionaisSaude.add(profissionalSaude);
		this.profissionaisSaude.add(profissionalSaude2);
		this.profissionaisSaude.add(profissionalSaude3);
		this.profissionaisSaude.add(profissionalSaude4);
	}

	public Recepcao getRecepcao() {
		return recepcao;
	}

	public void setRecepcao(Recepcao recepcao) {
		this.recepcao = recepcao;
	}
	
	public Set<ProfissionalSaude> getProfissionaisSaude() {
		return profissionaisSaude;
	}

	public void setProfissionaisSaude(Set<ProfissionalSaude> profissionaisSaude) {
		this.profissionaisSaude = profissionaisSaude;
	}

	public static void main(String[] args) {
		
		HospitalZap hospital = new HospitalZap();
		Recepcao recepcao = hospital.getRecepcao();
		
		Paciente p = new Paciente();
		p.setCpf("documento");
		p.setDataNascimento(LocalDate.of(1980, 4, 15));
		p.setNome("Teste");
		
		Paciente p2 = new Paciente();
		p2.setCpf("documento");
		p2.setDataNascimento(LocalDate.of(1980, 4, 15));
		p2.setNome("Teste2");
		
		System.out.println(recepcao.atendePaciente(p, TipoAtendimento.CONVENIO));
		System.out.println(recepcao.atendePaciente(p2, TipoAtendimento.PARTICULAR));
	}
	
}
