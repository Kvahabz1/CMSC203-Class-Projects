/**
 * Represents a Student class that inherits from Person Class
 * @author KVAHABZ1
 *
 */
public class Student extends Person{
	private String stId;
	private int ID_LENGTH = 6;
	 

	/**
	 * no arg Constructor
	 */
	public Student() {
		super();  //Calling the super class of the Student class 
		stId = "M000000";   //default value for stId
		 
	}
	/**
	 * Constructor that takes only name and sets the stId to default value
	 * @param name name of the student
	 */
	public Student(String name) {
		super(name);
		stId = "M000000";   //default value for stId
		
	}
	/**
	 * Constructor that takes all the parameters
	 *
	 */
		 
	public Student(String name, int age, String stId) {
		super(name, age); // Call the Person class parameterized constructor 
		this.stId = stId;
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
	@Override
	public String toString() {
		return 	super.toString() + " and Student ID is " + stId ;
	}
	@Override
	public boolean equals(Object anotherStudent) {
		
		Student temp = (Student) anotherStudent;
		 
		return (super.equals((Person) anotherStudent)  && stId.equals(temp.stId) );
	}
	
	
	
	

}
