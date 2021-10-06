package week1.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to chennai";
		int count = 0;
		str.toCharArray();
		char[] charArray = str.toCharArray();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println(charArray[i]);

			if (charArray[i] == 'e') {  
				count++;
				System.out.println("print the count of e exist: " +count);
			}

		}
	}

}
