package TP91;

import java.util.*;

public class Student implements Comparable<Student> {
	private String id;
	private Formation f;
	private Map<String, ArrayList<Double>> Resultats;

	Student(String ID, Formation F) {
		this.f = F;
		this.id = ID;
		Resultats = new TreeMap<String, ArrayList<Double>>();
		Set<String> s1 = this.f.getNomModule();
		for (String s : s1) {
			Resultats.put(s, new ArrayList<Double>());
		}
	}

	public void setId(String newId) {
		this.id = newId;
	}

	public void setFormation(Formation newF) {
		this.f = newF;
	}

	public void setResultats(Map<String, ArrayList<Double>> R) {
		this.Resultats = R;
	}

	public Map<String, ArrayList<Double>> getResultats() {
		return this.Resultats;
	}

	public String getId() {
		return this.id;
	}

	public Formation getFormation() {
		return this.f;
	}

	public boolean addResultat(String s, double note) {
		if (Resultats.containsKey(s)) {
			ArrayList<Double> l1 = Resultats.get(s);
			l1.add(note);
			return true;
		}
		return false;
	}

	public double average(String matiere) {
		double a;
		a = 0;
		if (Resultats.containsKey(matiere)) {
			ArrayList<Double> l1 = Resultats.get(matiere);
			for (double l : l1) {
				a += l;
			}
			return (a / l1.size());
		} else
			return a;
	}

	public double generalAverage() {
		int i = 0;
		double g = 0;
		Set<String> s1 = this.f.getNomModule();
		for (String s : s1) {
			// ArrayList<Double> l1 = Resultats.get(s);
			g += this.average(s);
			i++;
		}
		return (g / i);
	}

	public String toString() {
		return "Student with Id : " + this.id + ", " + this.f + " & he has results " + this.Resultats;
	}

	@Override
	public int compareTo(Student o) {
		if (this.generalAverage() == o.generalAverage()) {
			return 0;
		} else if (this.generalAverage() > o.generalAverage()) {
			return 1;
		} else
			return -1;
	}
}
