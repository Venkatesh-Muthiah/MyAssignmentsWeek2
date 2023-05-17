package week2.day3;

import java.util.Arrays;

public class MissingElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] != j) {
				System.out.println("Missing number is " + j);
				break;
			}
		}
	}

}
