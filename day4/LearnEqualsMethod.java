package week2.day4;

public class LearnEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("surreal");
		String str2 = new String("surreal");

		System.out.println("Using new keyword");

		if (str1.equals(str2)) {
			System.out.println("Both the string's content are equal");
		} else {
			System.out.println("Both the string's content are not equal");
		}

		if (str1 == str2) {
			System.out.println("Both string's memory address are equal");
		} else {
			System.out.println("Both string's memory address are not equal");
		}
		System.out.println();
		System.out.println("Using string literal");
		String val1 = "moment";
		String val2 = "moment";

		if (val1.equals(val2)) {
			System.out.println("Both the string's content are equal");
		} else {
			System.out.println("Both the string's content are not equal");
		}

		if (val1 == val2) {
			System.out.println("Both string's memory address are equal");
		} else {
			System.out.println("Both string's memory address are not equal");
		}
	}
}
