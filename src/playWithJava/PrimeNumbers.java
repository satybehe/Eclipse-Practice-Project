package playWithJava;

public class PrimeNumbers {

	
	public static void main(String[] args) {
		
		int i=0;
		while(i<=50){
			if(primeNumber(i))
			{
				System.out.println(i+" ");	
			}
			i++;
			
		}
	}
	
	public static boolean primeNumber(int no)
	{
		int count=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count>=2)
		{
			return false;
		}
		else
		{
			return true;
		}
   }
}
