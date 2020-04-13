import java.util.ArrayList;

/**
 * Demo class to demonstrate the Interface concept
 * @author KVAHABZ1
 *
 */
public class InterfacemDemo {

	public static void main(String[] args) {
		
		ArrayList<Person>   persons = new ArrayList<Person>();
		Student s1,s2;
		
		s1 =new Student ( "Mary", 20); 
		s2 =new Student ( "John", 18) ;
		
		s2.RegistrationPaid(true); 
	    persons.add( s1 );  
	    persons.add( s2 ); 
	    
		 
		for (Person p : persons)
		{
		 
			System.out.println(p);	//Calls the overridden toString method
			 
		}
		 
	 
	}

}
