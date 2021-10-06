package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 == length2) {
			char[] charArray = text1.toCharArray();
			char[] charArray1 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray1);

			for (int i = 0; i < text1.length(); i++) {
				for (int j = 0; j < text1.length(); j++) {
					if (charArray[i] == charArray1[j]) {
						System.out.println("after sorting " + charArray[i] + charArray1[j]);
						System.out.println("Anagram");// which has same letters in both strings

					}

				}

			}

		}

	}
}