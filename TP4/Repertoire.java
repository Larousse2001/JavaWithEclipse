package TP4;

import java.util.Arrays;
import java.lang.String;

public class Repertoire {
	private int nbc;
	private Contact C[];

	Repertoire(int maxTaille) {
		C = new Contact[maxTaille];
		nbc = 0;

	}

	public boolean ajouterContact(Contact Ct) {
		if((this.Rechercher(Ct) >= 0) || (nbc >= this.C.length)) return false;
		this.C[nbc] = Ct;
		nbc++;
		return true;
	}

	public Contact[] getContact() {
		return this.C;
	}

	public int getTaille() {
		return this.nbc;
	}

	public void setContact(Contact newc) {
		if((this.Rechercher(newc) >= 0) || (nbc >= this.C.length)) {
			System.out.println("Repertoire pleine ou element existant");

		}
		else {
			this.C[nbc]=newc;
		}

	}

	public void setTaille(int newTaille) {
		this.nbc = newTaille;
	}

	public Contact getContact(int i) {
		if(i >= nbc) {
			return null;
		}
		else {
			return this.C[i];
		}
	}

	public int Rechercher(Contact Ct) {
		for(int i = 0 ; i < nbc ; i++) {
			if(C[i].equals(Ct)) {
				return i;
			}
		}
		return -1;
	}

	public long[] gettels(String nom) {
		//for(int i = 0 ; i < C.length ; i++) {
		//	if(this.C[i].getNom().equals(nom) == true) {
		//		return C[i].getTable();
		//	}
		//}
		//return null;

		int i = 0;
		while((i < nbc) && (C[i].getNom().equalsIgnoreCase(nom))) {
			i++;
		}
		if(i < nbc) return C[i].getTable();
		else return null;
	}

	public Contact Rechercher(String nom) {
		for(int i = 0 ; i < nbc ; i++) {
			if(C[i].getNom().equals(nom.toUpperCase()) == true) {
				return C[i];
				//System.out.println(C[i]);
			}
		}
		return null;
	}

	public void supprimer(int i) {
		if(i <= nbc) {
			this.C[i] = this.C[nbc-1];
			this.C[nbc-1] = null;
			nbc--;
		}
		else {
			System.out.println("element non existant");
		}
	}

	public Contact[] getContactsTries() {
			Contact R[] = new Contact[nbc];	
			for (int i = 0 ; i < nbc ; i++) {
				R[i] = C[i];
			}
			for (int j = 0 ; j < nbc - 1 ; j++) {
				for (int k = j + 1 ; k < nbc ; k++) {
					if (R[j].getNom().compareTo(R[k].getNom()) > 0 ) {
						Contact Ct = R[j];
						R[j] = R[k];
						R[k] = Ct;
					}
				}
			}
			return R;
		
		// string1.compareTo(String string2)
		// if (string1 > string2) it returns a positive value.
		// if both the strings are equal lexicographically --> i.e.(string1 == string2) it returns 0.
		// if (string1 < string2) it returns a negative value.
	}

	public String toString() {
		return ("la repertoire a les contactes "+ Arrays.toString(this.C)+"  de nombre "+this.nbc );
	}
	
	public String toStringg() {
		 String s ="Repertoire [contact= ";
		 for(int i=0 ; i<nbc;i++) 
			 s+="\t"+C[i].toString();
			 return s+"]";
		 
	 }
}

