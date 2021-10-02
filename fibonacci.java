
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int t1 = 0;
		int t2 = 1;
		System.out.println("FIBONACCI SERIES");
		System.out.println("First" + n + "numbers");
		for (int i = 1; i <= n; i++) {
			System.out.println(t1 + ",");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
