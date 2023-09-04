package domain;

public class Lagarto implements Algoritimo {
	
	@Override
	public void executar(TipoAlgoritmo tipo) {
		switch(tipo) {
		case PEDRA:
			System.out.println("perdeu! pedra esmaga lagarto");
			break;
		case SPOCK:
			System.out.println("ganhou! lagarto envenena spock");
			break;
		case TESOURA:
			System.out.println("perdeu! tesoura decapita lagarto");
			break;
		case PAPEL:
			System.out.println("ganhou! lagarto come o papel");
			break;
		default:
			System.out.println("empatou! lagarto empata com lagarto");
			
		}
		
	}

}
