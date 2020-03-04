import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
	
	 
	 
		String name,ans, city;
		int age, size, cityCount=0;
		double minWage;
		Person p;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name :");
		name = input.nextLine();
		
		System.out.println("Enter age :");
		age = input.nextInt();
		System.out.println("Enter min Wage :");
		minWage  = input.nextInt();
		input.nextLine();   //Skip the newLine
		
		p = new Person(name,age,minWage);  // Create the person
		size = p.getDefaultSize();    //get the default size of the array of cities
		
		//Loop while the answer is y and the 
		do 
		{
			System.out.println("Enter the name of the city:");
			city = input.nextLine();
			p.addCity(city);  
			
			System.out.println("Do you want to add another city: (y/n)");
			ans = input.nextLine();
			cityCount++;
			 
			
		} while (cityCount<size && ans.equals("y") );
		
		
		System.out.println("Here is the list of cities this person has lived in:");	
		
		System.out.println(p);   //Show the information of the person
		System.out.println(p.citiesLivedIn());  //Show the information of the cities
		
		
		input.close();
	}
}