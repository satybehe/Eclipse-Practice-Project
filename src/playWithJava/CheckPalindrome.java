package playWithJava;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 String userInput= scn.next();
		 System.out.println(isPalindrome(userInput));
	}
	
public static boolean isPalindrome(String s)
{
	boolean result=false;
	int length=s.length();
	for(int i=0;i<length/2;i++)
	{
		if(s.charAt(i)==s.charAt(length-1-i))
				{
			result= true;
				}
		else
			result= false;
	}
	return result;
}

}
