package week2.day3;


public class MissingElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		int sum1 = 0;
		for (int i = 0; i <= 8; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		System.out.println(sum2);
		System.out.println("Mising element is " + (sum1 - sum2));  //this method is only applicable,when array is in ascending order.

	}

}
