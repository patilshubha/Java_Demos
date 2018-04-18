
public class Calculation {

	public void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Addition: "+sum);
	}
	
	public void add(double a, double b)
	{
		double sum = a + b;
		System.out.println("Addition: "+sum);
	}
	
	public void add(String a, String b)
	{
		String sum = a + b;
		System.out.println("Concatation: "+sum);
	}
	
	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		
		c1.add(10, 20);
		c1.add(2.3, 21.3);
		c1.add("Shubha", " Patil");		
	}
}
