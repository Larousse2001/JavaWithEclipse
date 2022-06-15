package TP8;

import java.util.Comparator;

public class ComparatorSal implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if (((Employer)o1).getSalaire() > ((Employer)o2).getSalaire()) {
			return -1;
		}
		else 
			if (((Employer)o1).getSalaire() < ((Employer)o2).getSalaire()) {
				return 1;
			}
		return 0;
	}
}