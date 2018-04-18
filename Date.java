
public class Date {
	
	//Instance variable
	int dd, mm, yy;
	
	//Default constructor
	public Date()
	{
		dd = 10;
		mm = 02;
		yy = 2010;
	}
	
	//Parameterized constructor
	public Date(int dd, int mm, int yy)  
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate(){
		
		System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		
		//Object creation - using default constructor
		Date d = new Date();
		
		//Object creation - using parameterized constructor
		Date d2 = new Date(16, 4, 2018);
		
		//Calling of a method
		d.displayDate();
		d2.displayDate();
	}
}