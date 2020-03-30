
/**
 * Keeps asking for information of Person and displays how many Persons objects are getting created.
 */
import java.util.Scanner;
 

public class ClassDemo {
	public static void main(String[] args) {


		String name,ans;
		int age, wage;
		Person p;
		
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age = input.nextInt();
			System.out.println("Enter min wage :");
			wage = input.nextInt();
			
			p = new Person(name,age,wage);
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
			
		}while (ans.equals("y") );
		
		//Notice calling the getNumOfPerson. It is called in the class level because it is a static method
		System.out.println(Person.getNumOfPerosns() + " Person(s) are created....");
		
		input.close();
	}
}