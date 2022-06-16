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
	  On obtient � l'ex�cution :
			Dans l'original 1 10 100 1000
			Dans la copie 1 10 100 1000
			Apres changement de tout ce que contient l'original :
			Dans l'original 2 20 200 2000
			Dans la copie 1 10 100 2000
	 */
}
/*
- return (entierA)super.clone(); : on appelle la m�thode clone de la classe Object qui fonctionnera ici car :
- la classe EntierA impl�mente l'interface Cloneable (sinon, une exception de la classe CloneNotSupportedException serait lanc�e � l'ex�cution)
- la classe EntierA ne contient pas de type par r�f�rence.

@Override : On utilise ce qu'on appelle une annotation qui s'adresse ici au compilateur. Celui-ci v�rifie � la compilation que la m�thode qui suit est bien la
red�finition d'une m�thode d�finie dans une superclasse.

- ObjetClonable copie = (ObjetClonable)super.clone(); : la conversion de type est ici n�cessaire car la m�thode clone de la classe Object annonce retourn� un Object.
- entierA.clone(); : on utilise la m�thode clone red�finie dans la classe EntierA. Si la classe EntierA ne red�finissait pas cette m�thode, la compilation n'aboutirait pas: il
serait signal� qu'il est impossible d'acc�der � la m�thode prot�g�e clone de la classe Object.

- System.arraycopy(tableau, 0, copie.tableau, 0 , tableau.length); : la m�thode statique arraycopy de la classe java.lang.System copie ici tableau, � partir de
l'indice 0, dans copie.tableau, � partir de l'indice 0, et tableau.length �l�ments sont copi�s. Il s'agit encore d'une copie de surface, c'est une copie des r�f�rences ; si le
tableau contenait des objets, il faudrait cloner ceux-ci si on voulait avoir un tableau de clones des objets.


*/