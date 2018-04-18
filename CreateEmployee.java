
public class CreateEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEmployeeId(101);
		e1.setFirstName("Shubhangi");
		e1.setLastName("Patil");
		
		System.out.println("Employee Id: "+e1.getEmployeeId());
		System.out.println("First Name: "+e1.getFirstName());
		System.out.println("Last Name: "+e1.lastName);
		
	}
}
