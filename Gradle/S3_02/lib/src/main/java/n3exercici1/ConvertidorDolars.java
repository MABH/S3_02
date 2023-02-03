package n3exercici1;

public class ConvertidorDolars implements ConvertidorDivisa{

	@Override
	public void resultat(float euros) {
		
		System.out.println("Preu en dolars: "+euros * 1.09f+" $");
	}

}
