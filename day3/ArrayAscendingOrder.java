package week2.day3;

import java.util.Arrays;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Sequence = { 1, 6, 3, 8, 2, 5, 10, 4, 7, 9 };

		System.out.println("Ascending Order: ");
		Arrays.sort(Sequence);
		for (int i = 0; i < Sequence.length; i++) {
			System.out.println(Sequence[i]);
		}

		System.out.println("Descending Order: ");
		for (int j = Sequence.length - 1; j >= 0; j--) {
			System.out.println(Sequence[j]);
		}

	}
}