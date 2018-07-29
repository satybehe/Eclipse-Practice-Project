package playWithJava;

public class HashCodePractice {

	public static void main(String[] args) {
		String s1= new String("Pune");
		String s2= new String("Pune");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(11);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		Object o = new Object();

	}

}
