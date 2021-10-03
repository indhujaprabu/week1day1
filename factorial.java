package week1day1;

public class factorial {

	public static void main(String[] args) {

		long fact = 1;
		int n = 5;
		System.out.println("Factorial of " + n + " numbers");
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println( + fact);
		}
	}

}
