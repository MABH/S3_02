package n2exercici1;

public class n2exercici1 {

	public static void main(String[] args) {
		 Pagament targetaPagament = new PagamentTargeta();
		 Pagament payPalPagament = new PagamentPaypal();
		 Pagament comptePagament = new PagamentCompte();
		 
		 Sabateria sabateria = new Sabateria();
		 sabateria.registrarPagament(targetaPagament);
		 sabateria.pagament();
		 
		 sabateria.registrarPagament(payPalPagament);
		 sabateria.pagament();
		 
		 sabateria.registrarPagament(comptePagament);
		 sabateria.pagament();
	}
}
