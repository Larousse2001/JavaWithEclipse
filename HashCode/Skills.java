package HashCode;

public class Skills {
    String Name_skills;
    int level;

    public Skills(String Name_skills, int level) {
        this.Name_skills = Name_skills;
        this.level = level;
    }

    public String toString() {
        return this.Name_skills + "    " + this.level;
    }

    public void setName(String name) {
        this.Name_skills = name;
    }

    public void setLevel(int newl) {
        this.level = newl;
    }
}
