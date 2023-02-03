package n3exercici1;

public class ConvertidorYens implements ConvertidorDivisa{

	@Override
	public void resultat(float euros) {
		System.out.println("Preu en Yens: "+ euros * 140.29f+" JPY");
	}

}
