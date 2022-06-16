package TP91;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Formation {
	private String id;
	private Map<String, Integer> Modules;

	Formation(String ID) {
		this.id = ID;
		this.Modules = new TreeMap<String, Integer>();
	}

	public void setId(String newId) {
		this.id = newId;
	}

	public String getId() {
		return this.id;
	}

	public void setModule(TreeMap<String, Integer> M) {
		this.Modules = M;
	}

	public Map<String, Integer> getModule() {
		return this.Modules;
	}

	public void addModule(String s, int i) {
		Modules.put(s, i);
	}

	public int getCoef(String s) {
		if (Modules.containsKey(s)) {
			return Modules.get(s);
		} else {
			return -1;
		}
	}

	public Set<String> getNomModule() {
		return Modules.keySet();
	}

	public String toString() {
		return "Formation with id " + this.id + " & with Modules " + this.Modules;
	}
}
