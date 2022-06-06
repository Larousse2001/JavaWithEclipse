package TP4;

import java.util.*;

public class Contact {
	private String nom;
	private long tels[];
	
	Contact(String n, long[] telephones) {
		this.nom = n.toUpperCase();
		this.tels = telephones;
	}
	
	Contact () {
		
	}
	
	public String getNom() {
		return(this.nom);
	}
	
	public long[] getTable() {
		return(this.tels);
	}
	
	public void setNom(String newn) {
		this.nom = newn.toUpperCase();
	}
	
	public void setTable(long[] newtels) {
		this.tels = newtels;
	}
	
	public String toString() {
		return ("le contact de nom "+ this.nom + Arrays.toString(this.tels) );
	}
	
	public boolean equals(Contact C) {
		if((this.nom.equals(C.nom)) && (Arrays.equals(this.tels, C.tels))){
			return true;
		}
		else {
			return false;
		}
	}
}

