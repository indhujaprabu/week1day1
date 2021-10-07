package week1.assignments;

import java.util.Arrays;

import java.util.Iterator;

public class FindTypes {

	public static void main(String[] args) {
		String Test="$$ Welcome to 2nd class of Automation$$";
		int letter=0,space=0,num=0,specialchar=0;
		char[] charArray=Test.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{ if(Character.isLetter(charArray[i]))
			letter++;
		else if (Character.isDigit(charArray[i]))
		num++;
		else if(Character.isSpaceChar(charArray[i]))
		space++;
		else
			specialchar++;
		
		System.out.println("letter is"+letter);
		System.out.println("digit is"+num);
		System.out.println("space is"+space);
		System.out.println("specialCharacter"+specialchar);
	}

}
}
