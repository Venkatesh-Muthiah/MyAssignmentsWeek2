package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, range = 8, a = 0, b = 1;

		for (int i = 0; i <= range; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}

	}

}
