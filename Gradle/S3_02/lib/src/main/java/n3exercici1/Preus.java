package n3exercici1;

public class Preus {
	 ConvertidorDolars dolars;
	 ConvertidorYens yens;
	 ConvertidorYuan yuan;
	 ConvertidorLliura lliura;
	 
	 public Preus (ConvertidorDolars dolars, ConvertidorYens yens, ConvertidorYuan yuan, ConvertidorLliura lliura) {
	    this.dolars = dolars;
	    this.yens = yens;
	    this.yuan = yuan;
	    this.lliura = lliura;
	  }
	 
	 public void veureConversions(float preuEuro) {
	    dolars.resultat(preuEuro);
	    yens.resultat(preuEuro);
	    yuan.resultat(preuEuro);
	    lliura.resultat(preuEuro);	    
	 }
}
