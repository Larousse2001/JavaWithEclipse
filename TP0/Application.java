package TP0;

public class Application {
    public static void main(String[] main) {
        Employe[] employes = new Employe[2];
        employes[0] = new Employe("AAA", "BBB", 10000);
        employes[1] = new Employe("CCC", "DDD", 10000);
        System.out.println("La liste des employes : ");

        for (Employe e : employes)
            System.out.println("\t" + e);

        Etudiant[] etudiants = new Etudiant[2];
        etudiants[0] = new Etudiant("MMM", "NNN", "12345");
        etudiants[1] = new Etudiant("OOO", "PPP", "56789");
        System.out.println("La liste des etudiants : ");

        for (Etudiant e : etudiants)
            System.out.println("\t" + e);

        Professeur[] professeurs = new Professeur[2];
        professeurs[0] = new Professeur("VVV", "WWW", 5700, "JAVA");
        professeurs[1] = new Professeur("XXX", "YYY", 5000, "UML");
        System.out.println("La liste des professeurs : ");

        for (Professeur p : professeurs)
            System.out.println("\t" + p);
    }
}
