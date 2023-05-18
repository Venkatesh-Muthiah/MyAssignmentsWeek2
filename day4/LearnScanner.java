package week2.day4;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String nextLine = scan.nextLine();

		char[] name = nextLine.toCharArray();

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
