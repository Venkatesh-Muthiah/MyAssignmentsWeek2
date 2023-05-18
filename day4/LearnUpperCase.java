package week2.day4;

public class LearnUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "changeme";

		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				char upper = Character.toUpperCase(charArray[i]);
				System.out.print(upper);
			} else {
				System.out.print(charArray[i]);
			}
		}
	}

}
