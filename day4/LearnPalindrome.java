package week2.day4;

public class LearnPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "civic", rev = "";
		char[] charArray = word.toCharArray();
		System.out.println(charArray);

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev += charArray[i];
		}
		System.out.println(rev);
		if (word.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
