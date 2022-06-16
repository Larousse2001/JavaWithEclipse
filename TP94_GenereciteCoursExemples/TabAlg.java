package TP94_GenereciteCoursExemples;

class TabAlg {
	public static <T extends Comparable> Pair<T> minmax(T[] tab) {
		if (tab == null || tab.length == 0)
			return null;
		T min = tab[0];
		T max = tab[0];
		for (T element : tab) {
			if (min.compareTo(element) > 0)
				min = element;
			if (max.compareTo(element) < 0)
				max = element;
		}
		return new Pair<T>(min, max);
	}
}
