package week1.assignments;

public class OddIndextoUpperCase {

	public static void main(String[] args) {
		String test="changename";
		char[] charArray=test.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]%2==1)
			{
		System.out.println("ChAnGeMe");
			break;
			}
		else
			System.out.println("don't change");
		}
		
		

	}

}
