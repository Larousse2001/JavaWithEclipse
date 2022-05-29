package HashCode;

import java.util.Arrays;

public class Projects {
    String Name;
    int days;
    int socre;
    int max;
    Skills Roles[];
    int N;

    public Projects(String Name, int days, int socre, int max, int n) {
        this.Name = Name;
        this.days = days;
        this.socre = socre;
        this.max = max;
        this.N = 0;
        Roles = new Skills[n];
    }

    public boolean add_controbuters(String nn, int s) {
        Skills ss = new Skills(nn, s);
        if (N < Roles.length) {
            Roles[N++] = ss;
            return true;
        }
        return false;
    }

    public String toString() {
        return this.Name + "  " + this.days + "  " + this.socre + "  " + this.max + "  " + this.N + "\n"
                + Arrays.toString(this.Roles);
    }
}
