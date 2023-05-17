package week2.day3;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 6, 3, 8, 2, 5, 10, 4, 7, 9 };

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {

			// System.out.println(num[i]);

		}

		System.out.println("Smallest value: " + num[0]);
		System.out.println("Largest value: " + num[num.length - 1]);
	}

}
