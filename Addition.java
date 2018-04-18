
public class Addition {

	public void add(int... values)
	{
		int sum = 0;
		for(int i = 0; i<values.length;i++)
		{
			sum = sum + values[i];
		}
		System.out.println("Addition: "+sum);
	}
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		
		a.add(10,20,30);
		a.add(10,20,30,40);
		a.add(10,20,30,40,50);
		
	}
}
