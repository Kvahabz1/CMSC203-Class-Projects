import java.util.Random;

/**
 * Represents a Student class that inherits from Person Class
 * @author KVAHABZ1
 *
 */
public class Student extends Person implements StudentInterface{
	private String stId;
	private int ID_LENGTH = 6;
	private boolean isregistered;
 
	/**
	 * no arg Constructor
	 */
	public Student() {
		super();  //Calling the super class of the Student class 
		stId = "M000000";   //default value for stId
		isregistered = false;
		 
	}
	/**
	 * Constructor that takes only name and sets the stId to default value
	 * @param name name of the student
	 */
	public Student(String name) {
		super(name);
		stId = "M00000";   //default value for stId
		isregistered = false;
		
	}
	/**
	 * Constructor that takes all the parameters
	 *
	 */
		 
	public Student(String name, int age) {
		super(name, age); // Call the Person class parameterized constructor 
		this.stId = generatestId() ;
	}
	
	
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	/**
	 * check if the student id is valid. A valid student Id start with M followed by 5 integers
	 * @return true if id is valid  false otherwise
	 */
	public boolean isValidID()
	{
		if (stId.length() !=ID_LENGTH)  //check the length
			return false;
		if (stId.charAt(0) !='M' )   // Check first character
			return false;
		for ( int i = 1; i < stId.length(); i++)	 // check the rest for being a digit
			if (! Character.isDigit(stId.charAt(i)))
				return false;
				
		return true;
		
	}
	/**
	 * 
	 * @return the amount of pay
	 */
	@Override
	public double pay()
	{
		return 0;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + " and Student ID is " + stId +
				(isregistered == true ? " and is registered" : " and is NOT registered") ;
	}
	@Override
	public boolean equals(Object anotherStudent) {
		
		Student temp = (Student) anotherStudent;
		 
		return (super.equals((Person) anotherStudent)  && stId.equals(temp.stId) );
	}
	 
	@Override
	public void RegistrationPaid(boolean fee) {
		isregistered = fee; 
		
	}
	@Override
	public String generatestId() {
		int intPart = ID_LENGTH-1;
		Random r = new Random();
		String zeros="",s;
		s= Integer.toString(r.nextInt(10000));
		for ( int i=0; i <= intPart-s.length(); i++)
			zeros +="0";
		
		return "M"+zeros+s;
	}
	
 
	
	

}
