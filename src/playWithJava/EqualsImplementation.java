package playWithJava;

public class EqualsImplementation {
	int radius;
	public EqualsImplementation(int radius) {
		this.radius=radius;
	}
	public boolean equals(Object arg)
	{
		return radius==((EqualsImplementation)arg).radius;
	}
	
	public static void main(String[] args) {
		EqualsImplementation e1 = new EqualsImplementation(5);
		EqualsImplementation e2 = new EqualsImplementation(5);
		System.out.println(e1.equals(e2));
	}

}
