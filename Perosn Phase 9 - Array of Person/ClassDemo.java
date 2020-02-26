import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *  Added component: using arrays to save Person objects
 * 1.Create array persons of type Person of size 5
 * 2.save the Person objects in the persons array
 * 3.Display information of Person objects using a loop
 *  @author  Student (Kian)
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
	
		final int SIZE = 5;
		int[] personAges = new int[SIZE];
		Person [] persons = new Person[SIZE];
		
		int numOfPersons = 0;   //keeps track of the number of persons entered by the user
		String name,ans;
		int age, ageTotal = 0;
		double ageAvg;
		
		Person p;
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age = input.nextInt();
			
			personAges[numOfPersons] = age;
			/*create the Person object and 
			 * save the object in to the persons array
			 */
			persons[numOfPersons] = new Person(name,age,20);  
			numOfPersons++;   // increment the number of persons
			
			input.nextLine();
			System.out.println("Do you want to continue? y/n");
			ans = input.nextLine();
			
		}while (ans.equals("y") && numOfPersons < SIZE );
		
		 
		System.out.print("You entered : ");
		//Display ages from the ages Array and add each to the ageTotal
		for (int i = 0; i < numOfPersons; i++) {  //Display ages from the array and add them up
			System.out.print(personAges[i]+ " ");
			ageTotal += personAges[i];
		}
		
		ageAvg = (double)ageTotal / (numOfPersons);
		System.out.println("\nThe average of ages is " + ageAvg);
		
		System.out.println("Here is the list of persons : ");
		//Display the information of Person objects from persons array
		for (int i = 0; i < numOfPersons; i++)
			System.out.println(persons[i]);
		
		input.close();
	}
}