/**
 * Demo class for Student
 * @author KVAHABZ1
 *
 */
public class StudentDemo {

	public static void main(String[] args) {
		 Student s1 = new Student ( "John", 25, "M12345");
		 
		 System.out.println(s1);
		 if (s1.isValidID())
			 System.out.println(s1.getStId() + " Is a valid ID");
		 else 
			 System.out.println(s1.getStId() + " Is NOT a valid ID");

		 Person  s2 = new Student ( "John", 25, "M12345");
		 
		 System.out.println(s2);
		 
		 /* IMPORTANT ***  although s2 is created as Student object but the type is Person
		    Therefore s2 can not call the isValidID() method, i.e s2.isValidId will cause a syntax error
		    
		 */
		 System.out.println(s1.equals(s2));   
		 
	}

}
