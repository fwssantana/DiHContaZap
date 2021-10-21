package hospital;

import java.time.LocalDate;

import exception.AgendamentoInvalidoException;

public class Consulta implements Faturavel {

	public static final Double precoBase = 100.0;
	
	private LocalDate dataAgendamento;
	
	
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) throws AgendamentoInvalidoException {
		if (dataAgendamento.isBefore(LocalDate.now())) {
			throw new AgendamentoInvalidoException("Data antes de hoje! Agendamento inválido!");
		}
		this.dataAgendamento = dataAgendamento;
	}

	@Override
	public Double getPreco() {
		return 100.0;
	}

}
