import java.util.Scanner;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int age;
		Person p;
		Scanner input = new Scanner(System.in);
		
		// create an array ages of size 10
		final int SIZE = 10;
		int[] ages = new int[SIZE];
		int counter = 0, sum = 0;
		double avgAge = 0;
		
		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			
			age = input.nextInt();
			ages[counter++] = age;
			
			p = new Person(name,age,20);
			System.out.println(p.getName() + 
					   " You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
		}while (ans.equals("y") && counter<10);
		
		for (int i: ages) {
			sum += i;
			if (i != 0)
				System.out.print(i + " ");
		}
		
		avgAge = sum / counter;
		System.out.println("\n" + avgAge);
		
		input.close();
	}
}