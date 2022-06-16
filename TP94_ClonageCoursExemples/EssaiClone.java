package TP94_ClonageCoursExemples;

class EssaiClone {
	public static void main(String arg[]) throws CloneNotSupportedException {
		ObjetClonable I = new ObjetClonable(), J;
		J = (ObjetClonable) I.clone();
		System.out.println("Dans l'original " + I.getEntierLocal() + " " + I.getEntierA().getEntier() + " "
				+ I.getTableau()[1] + " " + I.getEntierB().getEntier());
		System.out.println("Dans la copie " + J.getEntierLocal() + " " + J.getEntierA().getEntier() + " "
				+ J.getTableau()[1] + " " + J.getEntierB().getEntier());
		I.setEntierLocal(2);
		I.getEntierA().setEntier(20);
		I.getTableau()[1] = 200;
		I.getEntierB().setEntier(2000);
		System.out.println("\nApres changement de tout ce que contient l'original :");
		System.out.println("Dans l'original " + I.getEntierLocal() + " " + I.getEntierA().getEntier() + " "
				+ I.getTableau()[1] + " " + I.getEntierB().getEntier());
		System.out.println("Dans la copie " + J.getEntierLocal() + " " + J.getEntierA().getEntier() + " "
				+ J.getTableau()[1] + " " + J.getEntierB().getEntier());
	}
	/*
	  On obtient à l'exécution :
			Dans l'original 1 10 100 1000
			Dans la copie 1 10 100 1000
			Apres changement de tout ce que contient l'original :
			Dans l'original 2 20 200 2000
			Dans la copie 1 10 100 2000
	 */
}
/*
- return (entierA)super.clone(); : on appelle la méthode clone de la classe Object qui fonctionnera ici car :
- la classe EntierA implémente l'interface Cloneable (sinon, une exception de la classe CloneNotSupportedException serait lancée à l'exécution)
- la classe EntierA ne contient pas de type par référence.

@Override : On utilise ce qu'on appelle une annotation qui s'adresse ici au compilateur. Celui-ci vérifie à la compilation que la méthode qui suit est bien la
redéfinition d'une méthode définie dans une superclasse.

- ObjetClonable copie = (ObjetClonable)super.clone(); : la conversion de type est ici nécessaire car la méthode clone de la classe Object annonce retourné un Object.
- entierA.clone(); : on utilise la méthode clone redéfinie dans la classe EntierA. Si la classe EntierA ne redéfinissait pas cette méthode, la compilation n'aboutirait pas: il
serait signalé qu'il est impossible d'accéder à la méthode protégée clone de la classe Object.

- System.arraycopy(tableau, 0, copie.tableau, 0 , tableau.length); : la méthode statique arraycopy de la classe java.lang.System copie ici tableau, à partir de
l'indice 0, dans copie.tableau, à partir de l'indice 0, et tableau.length éléments sont copiés. Il s'agit encore d'une copie de surface, c'est une copie des références ; si le
tableau contenait des objets, il faudrait cloner ceux-ci si on voulait avoir un tableau de clones des objets.


*/