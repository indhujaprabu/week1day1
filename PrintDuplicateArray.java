package week1.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = arr.length;
		for (int i = 0; i < (arr.length); i++)

		{
			int count = 0;
			for (int j = 0; j < (arr.length); j++) {
				if (arr[i] == arr[j]) 
				
				{
					count++;
					System.out.println("First array variable" + arr[i]);
				}
			}
			
		}

	}

}
