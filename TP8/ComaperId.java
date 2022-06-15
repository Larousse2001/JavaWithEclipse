package TP8;

import java.util.Comparator;

public class ComaperId implements Comparator{

	
	public int compare(Object o, Object a) {
		// TODO Auto-generated method stub
		return ((Employer)o).getId().compareTo(((Employer)a).getId());
	}

	
}
