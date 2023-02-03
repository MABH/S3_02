package n1exercici1;

public interface Observable {
	public void registrarObserver(Observer observer);
	public void notificarObservers();
	public void esborrarObserver(Observer observer);
}
