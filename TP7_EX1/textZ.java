package TP7_EX1;

public class textZ {
	public static void main(String[] args) {
		Z x=new Z();
		x.incrementer();
		x.decrementer();
		System.out.println("valeur "+x.getValeur());
		x.modifier(3);
		System.out.println("valeur "+x.getValeur());
	}
}
