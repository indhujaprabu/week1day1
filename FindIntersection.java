package week1.assignments;
import java.util.Arrays;
import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		int count=0;
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		int length=arr1.length;
		int length1=arr2.length;
		for(int i=0;i< length;i++)
		{
			for(int j=0;j<length1;j++)
			{
				if(arr1[i] == arr2[j])
				{
					count++;
					System.out.println("These are the elements intersected in both arrays "+arr1[i] );
					
				}
					
			}
		}
		

	}

}
