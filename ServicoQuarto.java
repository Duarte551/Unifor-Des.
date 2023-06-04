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
	
	String resultado;
	public String servico(int tipoServico) {
		if (tipoServico == 1) {
		 resultado = "selecionar um quarto";
		 return resultado;
		}else if(tipoServico == 2) {
			resultado = "ir até o restaurante";
			return resultado;
		}else if(tipoServico == 3){
			resultado = "visitar as áreas de lazer";
			return resultado;
		}else if(tipoServico == 4) {
			resultado = "ver o valor gasto";
			return resultado;
		}else {
			resultado = "um número inválido";
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