public class Lazer {	
public int tipoLazer;
		
    public String parqueAquatico() {
        return "Você está no parque aquático. Divirta-se nas piscinas e toboáguas!";
    }

    public String passeioNaPraia() {
        return "Você está na praia. Aproveite o sol, o mar e a areia!";
        }
    
    public String lazerEscolhido(int tipoLazer) {
    	if(tipoLazer == 1) {
    		return parqueAquatico();
    	}else if (tipoLazer == 2) {
    		return passeioNaPraia();
    	}else {
    		return "Escolha um número válido";
    	}
    }
    
    public String escolhaLazer() {
    	return "Escolha seu lazer, no momento temos disponível as opções: \n[1] Parque Aquático \n[2] Passeio na praia";
    }
}

