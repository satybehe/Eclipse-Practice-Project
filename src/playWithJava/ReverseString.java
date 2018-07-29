package playWithJava;


public class ReverseString {
public static void main(String[] args) {
	
	String name="capgeminiindia";
	String reverseString=reverse(name);
	
System.out.println(reverseString);	
}	
public static String reverse(String s)
{
	String s1="";
	int stringLength=s.length();
	for(int i=stringLength-1;i>=0;i--)
	{
		s1+=s.charAt(i);
	}
	return s1;
	
}
	}


