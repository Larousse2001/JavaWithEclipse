package TP91;

import java.util.ArrayList;
import java.util.List;

public class SalleService implements ID {
	ArrayList<Salle> L;

	public SalleService() {
		L = new ArrayList<Salle>();
	}

	boolean add(Salle o) {
		if (L.add(o))
			return true;
		else
			return false;
	}

	boolean delete(Salle o) {
		if (L.contains(o)) {
			L.remove(o);
			return true;
		} else
			return false;
	}

	boolean update(Salle o) {
		if (L.contains(o)) {
			return true;
		} else
			return false;
	}

	public Salle findByID(int id) {
		Salle r = null;
		for (int i = 0; i < L.size(); i++) {
			if (L.get(i).getId() == id)
				r = L.get(i);
		}
		return r;
	}

	public List<Salle> findall() {
		return L;
	}

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}
