//package Lunna;

public class Quarto {
	private int tipoQuarto;
	public double valorQuarto;
	public int qtDias;
	public double contaValorQuarto;
	
	public int gettipoQuarto() {
		return tipoQuarto;
	}
	public void settipoQuarto(int tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public double getvalorQuarto() {
		return valorQuarto;
	}
	
	public void setvalorQuarto(double valorQuarto) {
		this.valorQuarto = valorQuarto;
	}
	
	public int getqtDias() {
		return qtDias;
	}
	
	public void setqtDias(int qtDias) {
		this.qtDias = qtDias;
	}
	
	public String escolhaQuarto() {
		return "Escolha o quarto que você deseja: \n[1] - Suíte presidencial - R$ 700,00 \n[2] - Suíte executiva - R$ 500.00  \n[3] - Cobertura - R$ 400.00 \n[4] - Quarto comum - R$ 200,00";
	}
	
	public String quartoEscolhido(int tipoQuarto) {
		if(tipoQuarto == 1) {
			double valorQuarto = 700.00;
			return "Excelente escolha! A suíte presidencial conta com cinco quartos, uma sala de estar impressionante e uma decoração personalizada. \n É a nossa suíte mais cara, mas vale muito a pena.";
		}else if(tipoQuarto == 2) {
			double valorQuarto = 500.00;
			return "Uma escolha muito boa de quarto, a suíte executiva conta com uma área de estar separada conectada a três quartos.";
		}else if(tipoQuarto == 3) {
			double valorQuarto = 400.00;
			return "Um quarto grande e sofisticado, com uma ótima vista para o mar.";
		}else if(tipoQuarto == 4) {
			double valorQuarto = 200.00;
			return "Um quarto ótimo para um casal ou viajante individual, conta com uma cama de casal e uma sala de estar.";
		}else {
			return "Por favor, escolha um quarto.";
		}
	}
	
	public String escolhaDias(int qtDias){
		return "Você passará " + qtDias + " dias em nosso hotel";
	}
	public String calcularContaHospedagem(double valorQuarto, int qtDias){
		double contaValorQuarto = qtDias * valorQuarto;
		return "O valor total de sua hospedagem é de: " + contaValorQuarto;
	}

	public String valorCrianca(String ehCrianca) {
		if (ehCrianca == "É criança.")
		contaValorQuarto = contaValorQuarto * 0.5;
		return "o valor da hospedagem da criança é " + contaValorQuarto;
	};
	}
	


