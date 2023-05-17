package week2.day3;

public class LearnJumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Break Statement"); // to terminate the loop

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				//System.out.println(i); //Don't sysout here
				break;
			}
		}

		System.out.println("Continue Statement"); // to stop the current iteration and enable to execute further iterations.

		for (int j = 10; j <= 15; j++) {
			if (j == 13) {
				continue;
			}
			System.out.println(j);
		}
	}
}