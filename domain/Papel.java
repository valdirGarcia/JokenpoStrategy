package domain;

public class Papel implements Algoritimo {

	@Override
	public void executar(TipoAlgoritmo tipo) {
		switch(tipo) {
		case PEDRA:
			System.out.println("ganhou! papel embrulha pedra");
			break;
		case SPOCK:
			System.out.println("ganhou! papel refuta o spock");
			break;
		case TESOURA:
			System.out.println("perdeu! tesoura corta o papel");
			break;
		case LAGARTO:
			System.out.println("perdeu! lagarto come o papel");
			break;
		default:
			System.out.println("empatou! papel empata com papel");
			
		}
		
	}

}
