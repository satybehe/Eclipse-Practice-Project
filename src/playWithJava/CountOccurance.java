package playWithJava;

public class CountOccurance {
	
	public static void main(String[] args) {
		String str="satya";
		String newString="";
		int count=1;
		int length=str.length();
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(i==0 || newString.indexOf(str.charAt(i))==-1)
			 	{
				for(int j=1;j<=str.length()-1;j++)
					{
					if(str.charAt(i)==str.charAt(j))
						{
					++count;
						}
					}
				}
			System.out.println("count of "+str.charAt(i)+"  "+count);
			newString+=str.charAt(i);
		}
		
	}

}
