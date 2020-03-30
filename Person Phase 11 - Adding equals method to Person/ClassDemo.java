
import java.util.Scanner;

 

public class ClassDemo {
	public static void main(String[] args) {


		String name;
		int age, wage;
		Person p1,p2;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Lets enter the information of the FIRST person....");
		System.out.println("Enter name :");
		name = input.nextLine();
		System.out.println("Enter age :");
		age = input.nextInt();
		System.out.println("Enter minimum wage:");
		wage = input.nextInt();
		p1 = new Person(name,age,wage);
		
		input.nextLine();
		
		System.out.println("Lets enter the information of the SECOND person....");
		System.out.println("Enter name :");
		name = input.nextLine();
		System.out.println("Enter age :");
		age = input.nextInt();
		System.out.println("Enter minimum wage:");
		wage = input.nextInt();
		p2 = new Person(name,age,wage);
 
		if ( p1.equals(p2))
			
			System.out.println("Two Persons are Identical");
		else 
			System.out.println("Two Persons are NOT Identical");
		
		input.close();
	}
}