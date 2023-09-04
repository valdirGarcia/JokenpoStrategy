package domain;

public class Jokenpo {
	
	private Algoritimo algoritimo;
	
	public void setAlgoritmo(Algoritimo algoritimo) {
		this.algoritimo = algoritimo;
	}
	
	public void jogar(TipoAlgoritmo tipo) {
		algoritimo.executar(tipo);
	}
}



