
public class Student {

	int rollNumber;
	String firstName, lastName;
	
	public Student(int rollNumber, String firstName, String lastName)
	{
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//String representation of an object
	public String toString()
	{
		return "RollNumber: "+rollNumber+", FirstName: "+firstName+", Lastname: "+lastName;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Akash", "Mane");
		System.out.println(s1);
	}
	
}
