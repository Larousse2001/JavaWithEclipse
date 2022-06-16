package TP93;

import java.util.*;

public class Parking {
	int capacite;
	int places;
	Set<Voiture> info = new HashSet<Voiture>();

	public Parking(int n) {
		this.capacite = n;
	}

	public int placesoccupes() {
		return this.places;
	}

	public synchronized boolean entrer(Voiture v) {
		if (this.placesoccupes() < capacite) {
			places++;
			info.add(v);
			return true;
		} else
			return false;
	}

	public synchronized boolean sortir(Voiture v) {
		if (info.contains(v)) {
			info.remove(v);
			places--;
			return true;
		} else
			return false;
	}
}
