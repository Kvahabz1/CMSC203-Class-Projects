

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *  Added component: using arrays to save ages of Persons
 * 1.Create array ages of type int of size 5
 * 2.Every time user inputs an age, save it into the array as well
 * 3.Modify loop to ask for another person if person selects 'y' or 
 * 	 if number of people is less than 5
 * 4.After loop finishes, display each user-provided age from the array
 * 5.Display average of all ages
 * @author  Student (Kian)
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
	
		final int SIZE = 5;
		int[] personAges = new int[SIZE];
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
			numOfPersons++;
			p = new Person(name,age,20);
			System.out.println(p.getName() + 
					   " You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue? y/n");
			ans = input.nextLine();
		}while (ans.equals("y") && numOfPersons < SIZE );
		
		System.out.print("You entered : ");
		
		for (int i = 0; i < numOfPersons; i++) {  //Display ages from the array and add them up
			System.out.print(personAges[i]+ " ");
			ageTotal += personAges[i];
		}
		
		ageAvg = (double)ageTotal / (numOfPersons);
		System.out.println("\nThe average of ages is " + ageAvg);
		
		input.close();
	}
}