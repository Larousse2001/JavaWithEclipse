package TP5;

public class Test {

	public static void main(String[] args) {
		C1 o1 = new C1();
		C1 o2 = new C11();
		C111 o3 = new C111();
		C11 o4 = new C111();
		C1 o5 = new C111();
		
		System.out.println(o1.getClass());
		System.out.println(o2.getClass());
		System.out.println(o3.getClass());
		System.out.println(o4.getClass());
		System.out.println(o5.getClass());
		
		System.out.println(o1 = o2);
		System.out.println(o1 = o3);
		System.out.println(o3 = (C111)o1);
		System.out.println(o4 = (C11)o5);
		System.out.println(o4 = (C111)o2);

	}

}
