package TP7_EX1;

public class Z implements Modifiable  {
	private int valeur;
	public int getValeur() {
		return valeur;
	}
	
	public void decrementer() {
		valeur--;
	}
	
	public void incrementer() {
		valeur++;
	}
	
	public void modifier(int v) {
		valeur=v;
	}
}