package n1exercici1;

import java.util.Random;

public class n1exercici1 {

	public static void main(String[] args) {
		//Agent Observable
		Agent1 agent1= new Agent1();				
				
		//Observers
		Agencia1 agencia1 = new Agencia1();
		Agencia2 agencia2 = new Agencia2();
				
		//Registrem els Observers para el agent
		agent1.registrarObserver(agencia1);
		agent1.registrarObserver(agencia2);
				
		//Variacions de la borsa
		int valor1 = new Random().nextInt(2);
		int valor2 = new Random().nextInt(2);
		agent1.actualitzarValorsAgent(valor1, valor2);	
		
	}
}
