package TP1_2_3;

import java.util.*;

public class TestFinal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N;
		do {
            System.out.print("Input the number of test cases :");
            N = s.nextInt();
        } while ((N >= 30) && (0 <= N));
		
		Cercle T[] = new Cercle [N];
		
		for (int i = 0; i < N; i++) {
            System.out.println("T[" + i + "]");
            T[i]= new Cercle (s.nextFloat(), s.nextFloat(), s.nextFloat());
        }
		
		for (int i = 0; i < N; i++) {
            System.out.println("T[" + i + "]=" + T[i]);
        }
		s.close();
	}

}
