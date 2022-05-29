package HashCode;

class Controbuters {
	String Name_C;
	int Nb_skills;
	Skills[] Sk;
	int N;

	public Controbuters(String Name_C, int Nb_skills, Skills[] Sk) {
		this.Name_C = Name_C;
		this.Nb_skills = Nb_skills;
		this.Sk = Sk;
		N = 0;

	}
	
	public Controbuters(String Name_C, int Nb_skills, int n) {
		this.Name_C = Name_C;
		this.Nb_skills = Nb_skills;
		this.Sk = new Skills[n];
		N = 0;

	}
	
	public boolean addSkill(Skills s) {
		if (N < Sk.length) {
			Sk[N++] = s;
			return true;
		}
		return false;
	}
	
	public int getNb() {
		return this.Nb_skills;
	}

	public String toString() {
		return "" + this.Name_C + "  " + this.Nb_skills + "\n" + this.Sk;
	}

	public void setName(String name) {
		this.Name_C = name;
	}

}
