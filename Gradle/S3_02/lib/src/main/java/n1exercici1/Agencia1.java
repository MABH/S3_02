package n1exercici1;

public class Agencia1 implements Observer{
	@Override
	public void actualitza(Agent agent) {
		if (agent.getVariacio1()==1)
			System.out.println("Agencia1 - EL "+agent.getNomIndexBorsa1()+" puja");
		else
			System.out.println("Agencia1 - El "+agent.getNomIndexBorsa1()+" baixa");
	}
}
