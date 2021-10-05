package week1.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int length = data.length;
		System.out.println("Ascending order of the Array");
		for (int i = 0; i < data.length; i++) {

			System.out.println(data[i]);
		}
		System.out.println("Second Largest element in Array " + data[length - 2]);
	}

}
