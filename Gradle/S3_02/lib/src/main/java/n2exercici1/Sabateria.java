package n2exercici1;

public class Sabateria {
	Pagament pagament;
	
	 public void registrarPagament(Pagament pagament) {
	        this.pagament = pagament;
	    }

	    public void pagament() {
	    	System.out.println("Efectuant el pagament a la sabateria");
	        pagament.pagament();
	    }
}