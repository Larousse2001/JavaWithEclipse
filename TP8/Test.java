package TP8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Employer> t = new ArrayList<Employer>(); 
		
		
		t.add(new Employer("123","Sami",234));
		t.add(new Employer("124","Anis",235));
		System.out.println(t);
		
		Employer e1 = null;
		Employer e2 = null;
		Employer e3 = null;
		Employer e4 = null;
		
		Collections.sort(t);
		System.out.println(t);
		Collections.sort(t);
		System.out.println(t);
		Collections.sort(t);
		System.out.println(t);
		
		TreeSet tsid=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		TreeSet tid=new TreeSet(new ComaperId());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		TreeSet tss=new TreeSet(new ComparatorSal());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);

	}
	

}
