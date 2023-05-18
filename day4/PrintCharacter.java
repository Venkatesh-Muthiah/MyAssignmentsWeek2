package week2.day4;

public class PrintCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "venkatesh";
		int length = name.length();
		System.out.println("Length of string is " + length);
		char[] charArray = name.toCharArray();

		System.out.println("Forward:");
		for (int i = 0; i < charArray.length; i++) {

			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse:");
		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.print(charArray[i] + " ");
		}
	}

}
