package TP93;

public class TestParking {

	public static void main(String[] args) {
		Parking p = new Parking(3);
		Voiture v1 = new Voiture("v1", p);
		Voiture v2 = new Voiture("v2", p);
		Voiture v3 = new Voiture("v3", p);
		Voiture v4 = new Voiture("v4", p);

		v1.start();
		v2.start();
		v3.start();
		v4.start();

	}

}
