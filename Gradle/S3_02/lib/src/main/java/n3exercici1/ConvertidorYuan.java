package n3exercici1;

public class ConvertidorYuan implements ConvertidorDivisa{

	@Override
	public void resultat(float euros) {
		System.out.println("Preu en Yuan: "+ euros*7.37f+" CNY");
	}

}
