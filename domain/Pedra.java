package domain;

public class Pedra implements Algoritimo {
	
	@Override
	public void executar(TipoAlgoritmo tipo) {
		switch(tipo) {
		case PAPEL:
			System.out.println("pereu! papel embrulha pedra");
			break;
		case SPOCK:
			System.out.println("perdeu! spock vaporiza pedra");
			break;
		case TESOURA:
			System.out.println("ganhou! pedra quebra tesoura");
			break;
		case LAGARTO:
			System.out.println("ganhou! pedra esmaga lagarto");
			break;
		default:
			System.out.println("empatou! pedra empata com pedra");
			
		}
		
	}


}
