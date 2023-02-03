package n1exercici1;

public class Agencia2 implements Observer{
	@Override
	public void actualitza(Agent agent) {
		if (agent.getVariacio2()==1)
			System.out.println("Agencia2 - El "+agent.getNomIndexBorsa2()+" puja");
		else
			System.out.println("Agencia2 - El "+agent.getNomIndexBorsa2()+" baixa");
	}
}
