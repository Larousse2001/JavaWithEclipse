package TP4;

public class TestContact {

	public static void main(String[] args) {
		//1ere methode
		long []t1= {222,44,555};
		Contact c1 = new Contact("nom1,p1",t1);
		
		// 2eme metode
		long []t2= new long [2];
		t2[0]=2222;
		t2[1]=555777;
		Contact c2 = new Contact("nom2,p2",t2);		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		}

	}