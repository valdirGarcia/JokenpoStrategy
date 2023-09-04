package domain;

public class Tesoura implements Algoritimo {
	
	@Override
	public void executar(TipoAlgoritmo tipo) {
		switch(tipo) {
		case PEDRA:
			System.out.println("perdeu! pedra quebra tesoura");
			break;
		case SPOCK:
			System.out.println("perde! spock derrete tesoura");
			break;
		case TESOURA:
			System.out.println("ganhou! tesoura corta o papel");
			break;
		case LAGARTO:
			System.out.println("ganhou! tesoura corta o lagarto");
			break;
		default:
			System.out.println("empate! tesoura empata com tesoura");
			
		}
	}

}
