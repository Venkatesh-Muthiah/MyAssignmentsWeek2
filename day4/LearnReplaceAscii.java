package week2.day4;

public class LearnReplaceAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "testleaf001@gmail.com";
		email.toCharArray();

		char[] charArray = email.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 48 && charArray[i] <= 57) {
				System.out.println(charArray[i]);                // to get numbers alone
			}                                                     // by using ASCII values
		}                                                         // ASCII value for numbers are 48-57
	}

}
