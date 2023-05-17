package week2.day3;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 11, 21, 31, 21, 8, 9, 11 };
		// Output=11,21

		System.out.println("Duplicate values are: ");

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println(numbers[j]);
				}
			}

		}
	}

}

