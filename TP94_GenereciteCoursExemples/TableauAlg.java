package TP94_GenereciteCoursExemples;

class TableauAlg {

	public static Paire<String> minmax(String[] chaines) {
		if (chaines == null || chaines.length == 0)
			return null;
		String min = chaines[0];
		String max = chaines[0];
		for (String chaine : chaines) {
			if (min.compareTo(chaine) > 0)
				min = chaine;
			else if (max.compareTo(chaine) < 0)
				max = chaine;
		}
		return new Paire<String>(min, max);
	}

	public static <T> T getMilieu(T[] tableau) {
		return tableau[tableau.length / 2];
	}

	/*
	 * Cette m�thode est d�finie dans une classe ordinaire, et non dans une classe
	 * g�n�rique C'est toutefois une m�thode g�n�rique Les variables de type sont
	 * ins�r�es apr�s les modificateurs (public static, dans ce cas) et avant le
	 * type de retour
	 */

	public static <T> T min(T[] tab) {
		if (tab == null || tab.length == 0)
			return null;
		T pluspetit = tab[0];
		for (T val : tab)
			if (((String) pluspetit).compareTo((String) val) > 0)
				pluspetit = val;

		return pluspetit;
	}
	
	/*
	 	Mais dans cette m�thode g�n�rique min() un probl�me demeure
		En effet, la variable pluspetit poss�de un type T, ce qui signifie qu'il pourrait s'agir d'un objet d'une classe ordinaire
		Comment savoir alors que la classe T poss�de une m�thode compareTo() ?
		D'ailleurs, si on �crit ce code, on obtient une erreur du compilateur en sp�cifiant que cette m�thode compareTo() n'est pas connue pour un type quelconque T
	 */
}
