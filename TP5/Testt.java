package TP5;

public class Testt {

	public static void main(String[] args) {
		B b = new B();
		D d = new D();
		
		System.out.println(b instanceof B);
		System.out.println(b instanceof D);
		System.out.println(d instanceof B);
		System.out.println(d instanceof D);
		b=d;
		System.out.println(b instanceof B);
		System.out.println(b instanceof D);

	}

}
