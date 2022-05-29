package HashCode;

import java.util.*;

public class Test {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int nc = sc.nextInt();
    	int i = 0;
    	while(i<nc) {
    		String sss = sc.nextLine();
    		int ssss = sc.nextInt();
            Controbuters a1 = new Controbuters(sss, ssss, ssss);
        	Skills s1 = new Skills("C++", 2);
            a1.addSkill(s1);
            System.out.println(a1.toString());
            i++;
    	}

        Projects p = new Projects("WebChat", 10, 20, 7, 2);
        System.out.println(p.toString());
        p.add_controbuters("Python", 3);
        p.add_controbuters("JAVA", 2);

        System.out.println(p.toString());
        sc.close();


    }
}
