package Lunna;

public class ServicoQuarto {
	private int tipoServico;
	
	public ServicoQuarto(int tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public int getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(int tipoServico) {
		this.tipoServico = tipoServico;
	}
	Quarto quarto = new Quarto();
	
	String resultado;
	public String servico(int tipoServico) {
		if (tipoServico == 1) {
		 resultado = "Selecionar um quarto + \n" + quarto.escolhaQuarto();
		 return resultado;
		}else if(tipoServico == 2) {
			resultado = "Ir até o restaurante";
			return resultado;
		}else if(tipoServico == 3){
			resultado = "Visitar as áreas de lazer";
			return resultado;
		}else if(tipoServico == 4) {
			resultado = "Ver o valor gasto";
			return resultado;
		}else {
			resultado = "Número inválido";
			return resultado;
		} 
	}
	public String servEscolhido() {
		return "O usuário escolheu " + servico(tipoServico);
	}
	
	public String exibirServico() {
		return "O usuário escolheu " + servico(tipoServico);
	}
}