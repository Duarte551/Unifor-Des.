package Lunna;

public class Quarto {
	private int tipoQuarto;
	
	public int gettipoQuarto() {
		return tipoQuarto;
	}
	public void settipoQuarto(int tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public String escolhaQuarto() {
		return "Escolha o quarto que você deseja: \n[1] - Suíte presidencial \n[2] - Suíte executiva \n[3] - Cobertura \n[4] - Quarto comum";
	}
	public String quartoEscolhido(int tipoQuarto) {
		if(tipoQuarto == 1) {
			return "Excelente escolha, a suíte presidencial conta com cinco quartos, uma sala de estar impressionante e uma decoração personalizada, é nossa suíte mais cara, mas vale muito a pena";
		}else if(tipoQuarto == 2) {
			return "Uma escolha muito boa de quarto, a suíte executiva conta com uma área de estar separada conectada a três quartos";
		}else if(tipoQuarto == 3) {
			return "Um quarto grande e sofisticado, com uma ótima vista para o mar";
		}else if(tipoQuarto == 4) {
			return "Um quarto ótimo para um casal ou viajante individual, conta com uma cama de casal e uma sala de estar";
		}else {
			return "Por favor, escolha um quarto";
		}
	}
	
}

