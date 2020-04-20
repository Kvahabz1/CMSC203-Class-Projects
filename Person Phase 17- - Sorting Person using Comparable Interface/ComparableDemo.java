import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
 

/**
 * Demo class to demonstrate the Interface concept
 * @author KVAHABZ1
 *
 */
public class ComparableDemo {

	public static void main(String[] args) {
		
		Person []  persons = new Person[3];
		Person s1,s2,s3;
		
		s1 =new Person ( "Mary", 20);
		s2 =new Person ("John", 18) ;
		s3 =new Person ( "Adam", 18) ;
	 
		 
	    persons[0] =  s1 ;  
	    persons[1] =  s2 ;  
	    persons[2] =  s3 ;  
	     
		 
		for (Person p : persons)
		{
		 
			System.out.println(p);	//Calls the overridden toString method
			 
		}
		/* sort method of the Arrays class refers to the compareTo method of the Comparable class that 
		 * is implemented in the Person class in order to sort persons based on their name
		 * 
		 */
		Arrays.sort(persons);   
		
		System.out.println("after sort");
		
		for (Person p : persons)
		{
		 
			System.out.println(p);	//Calls the overridden toString method
			 
		}
	}

}