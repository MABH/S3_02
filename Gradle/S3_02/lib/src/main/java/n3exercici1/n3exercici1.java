package n3exercici1;

public class n3exercici1 {

	public static void main(String[] args) {
		Preus preus = new Preus(new ConvertidorDolars(), new ConvertidorYens(), new ConvertidorYuan(), new ConvertidorLliura());
		
		System.out.println("Preu llauna de coca-cola: 0,8 €");
		preus.veureConversions(0.8f);
		
		System.out.println("\nPreu oli d'oliva: 4,76 €");
		preus.veureConversions(4.76f);
		
		System.out.println("\nPreu de carn picada: 6,65 €");
		preus.veureConversions(6.65f);
	}

}
