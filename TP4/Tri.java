package TP4;

public class Tri {
	public static void main(String args[]) {
		String STR = "java";
		char[] StringtoChar = STR.toCharArray();
		for (int i = 0; i < (StringtoChar.length - 1); i++) {
			for (int j = i + 1; j > 0; j--) {
				if (StringtoChar[j] < StringtoChar[j - 1]) {
					char Temp = StringtoChar[j - 1];
					StringtoChar[j - 1] = StringtoChar[j];
					StringtoChar[j] = Temp;
				}
			}
		}
		String SortedString = new String(StringtoChar);
		System.out.println("The Unsorted String is : " + STR);
		System.out.println("The Sorted String is : " + SortedString);
	}

}