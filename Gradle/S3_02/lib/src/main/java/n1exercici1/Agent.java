package n1exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agent implements Observable{
		private List<Observer> observers;		
		private String nomIndexBorsa1, nomIndexBorsa2;
		private int variacio1, variacio2;	
		
		public Agent(){
			observers = new ArrayList<Observer>();
		}
		
		public String getNomIndexBorsa1() {
			return nomIndexBorsa1;
		}
		
		public String getNomIndexBorsa2() {
			return nomIndexBorsa2;
		}
		
		@Override
		public void registrarObserver(Observer observer) {
			if(observer != null){
				this.observers.add(observer);
			}
		}

		@Override
		public void notificarObservers() {
			Iterator<Observer> it = observers.iterator();
			while(it.hasNext()){
				Observer observer = it.next();
				observer.actualitza(this);
			}
		}

		@Override
		public void esborrarObserver(Observer observer) {
			if(observer != null){
				this.observers.remove(observer);
			}
		}
		
		public int getVariacio1(){
			return variacio1;
		}
		
		public int getVariacio2(){
			return variacio2;
		}
		
		public void actualitzarValorsAgent(int valor1Actualitzat, int valor2Actualitzat){
			this.variacio1 = valor1Actualitzat;
			this.variacio2 = valor2Actualitzat;
			this.notificarObservers();
		}		
	
		public void setNomIndexBorsa(String nomIndexBorsa1, String nomIndexBorsa2) {
			this.nomIndexBorsa1=nomIndexBorsa1;
			this.nomIndexBorsa2=nomIndexBorsa2;
		}
		
		
}
