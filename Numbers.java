
public class Numbers {

	public static void main(String[] args) {
		
		int numbers[] = {10,20,30,40,50};
		
		//Traditional for loop
		System.out.println("Using Traditional for loop: ");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]+",");
		}
		
		//Enhanced for loop
		System.out.println("Using Enhanced for loop: ");
		for(int i:numbers)
		{
			System.out.println(i+",");
		}
	}
}
