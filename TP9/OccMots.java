package TP9;

import java.util.*;
import java.io.*;

public class OccMots {
	static int count(ArrayList al, Object o) {
		Iterator it = al.iterator();
		int nb = 0;
		while(it.hasNext()) {
			Object oal = it.next();
			if(oal.equals(o))
				nb++;
		}
		return nb;
	}
	public static void main(String[] args) throws FileNotFoundException{
		//Liste des mots
		Scanner s = null;
		StringTokenizer st;
		String separateurs = " ,;:!?./()[]{}";
		ArrayList al = new ArrayList();
		
		try {
			s = new Scanner(new FileReader("source.txt"));
			while(s.hasNext()) {
				st = new StringTokenizer(s.next(),separateurs);
				while(st.hasMoreTokens()) {
					al.add(st.nextToken().toLowerCase());
				}
			}
		}
		finally {
			if(s != null) s.close();
		}
		//L'ensemble des mots
		HashSet hs = new HashSet();
		for(Object m:al)
			hs.add(m);
		System.out.println(hs);
		//Dictionnaire pour le nombre d'occurences
		HashMap hm = new HashMap();
		for(Object m:hs)
			hm.put(m, count(al,m));
		System.out.println(hm);

	}

}
