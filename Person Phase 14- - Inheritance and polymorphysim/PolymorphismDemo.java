import java.util.ArrayList;

/**
 * Demo class to demonstrate the polymorphism concept
 * @author KVAHABZ1
 *
 */
public class PolymorphismDemo {

	public static void main(String[] args) {
		
		ArrayList<Person>   persons = new ArrayList<Person>();
		
		persons.add( new Person  ( "John", 25 ));   //Add a person object
		persons.add( new Student ( "Mary", 20, "M12345") );   //Add a Student object
		persons.add( new LearningAssistant ( "Kim", 2, "M12345", 20,20) );   //Add a Learning assistant object
		persons.add( new Instructor ( "Paul", 20, "IN12345", 25,100) );   //Add an Instructor object
		 
		/* loop through the objects in the persons arrayList and 
		   call the pay() method and toString method for each DIFFERENT Object in the array
		*/
		 
		for (Person p : persons)
		{
		 
			System.out.print(p);	//Calls the overridden toString method
			System.out.println(" is paid " + p.pay());  //calls the overridden pay method 
		}
		 
	 
	}

}
