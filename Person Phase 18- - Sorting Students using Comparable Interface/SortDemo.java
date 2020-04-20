import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 

/**
 * Demo class to demonstrate the Interface concept and sorting with comparable
 * @author KVAHABZ1
 *
 */
public class SortDemo {

	public static void main(String[] args) {
		
		ArrayList<Person>   persons = new ArrayList<Person>();
		Student s1,s2,s3,s4;
		
		s1 =new Student ( "Mary", 20);
		s2 =new Student ( "John", 18) ;
		s3 =new Student ( "Adam", 18) ;
		s4 =new Student ( "jane", 18) ;
		 
	    persons.add( s1 );  
	    persons.add( s2 ); 
	    persons.add( s3 );  
	    persons.add( s4 ); 
	    
		 
		for (Person p : persons)
		{
		 
			System.out.println(p);	//Calls the overridden toString method
			 
		}
		/* sort method of the Collections class refers to the compareTo method of the Comparable class that 
		 * is implemented in the Student class in order to sort students based on their stID
		 * 
		 */
		Collections.sort(persons);   
		
		System.out.println("after sort");
		
		for (Person p : persons)
		{
		 
			System.out.println(p);	//Calls the overridden toString method
			 
		}
	}

}