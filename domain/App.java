package domain;
import domain.Algoritimo;
import domain.Jokenpo;
import domain.Papel;
import domain.TipoAlgoritmo;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escolha uma opção de jogada: ");
		System.out.println();
		System.out.println("Pedra (1)");
		System.out.println("Papel (2)");
		System.out.println("Tesoura (3)");
		System.out.println("Lagarto (4)");
		System.out.println("Spock (5)");
		
	    int escolhaUsuario = sc.nextInt();
	
	    Algoritimo algoritmoUsuario = getAlgoritimo(escolhaUsuario);
		
		// gerar opcao randomica para a jogada do computador e convereter em enum
		Integer random = new Random().nextInt(5) + 1;
		TipoAlgoritmo computador = TipoAlgoritmo.getTipo(random);
		
		
		
		Jokenpo jokenpo = new Jokenpo();
		jokenpo.setAlgoritmo(algoritmoUsuario);
		
		jokenpo.jogar(computador);
		
		sc.close();

	}
	
	static Algoritimo getAlgoritimo(Integer id) {
	    TipoAlgoritmo tipo = TipoAlgoritmo.getTipo(id); 
	    switch (tipo) {
	        case PAPEL:
	            return new Papel();
	        case PEDRA:
	        	return new Pedra();
	        case TESOURA:
	        	return new Tesoura();
	        case LAGARTO:
	        	return new Lagarto();
	        case SPOCK:
	        	return new Spock();
	        default:
	            throw new RuntimeException("Tipo inválido");
	    }
	}


}
