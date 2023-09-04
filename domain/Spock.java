package domain;

public class Spock implements Algoritimo {

	@Override
	public void executar(TipoAlgoritmo tipo) {
		switch(tipo) {
		case PEDRA:
			System.out.println("ganhou! spock vaporiza pedra");
			break;
		case PAPEL:
			System.out.println("perdeu! papel refuta o spock");
			break;
		case TESOURA:
			System.out.println("ganhou! spock esmaga tesoura");
			break;
		case LAGARTO:
			System.out.println("perdeu! lagarto enevenena spock");
			break;
		default:
			System.out.println("empatou! spock empata com spock");
			
		}
		
	}

}
