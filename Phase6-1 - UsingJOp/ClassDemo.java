import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int age;
		Person p;
		//=====>Scanner input = new Scanner(System.in);
		do {

			//======System.out.println("Enter name :");
			//name = input.nextLine();
			name = JOptionPane.showInputDialog("Enter name :");
			//=====System.out.println("Enter age :");
			//age = input.nextInt();
			age=Integer.parseInt(
					JOptionPane.showInputDialog("Enter age :"));	
			p = new Person(name,age);
			//System.out.println(p.toString());// toString is called automatically here
			//System.out.println(p.getName() + 
			//		   " You are " +p.getAge() + " Years old");
			JOptionPane.showMessageDialog(null, p);
			//input.nextLine();
			ans= JOptionPane.showInputDialog("Do you want to continue?");
			//ans = input.nextLine();
		}while (ans.equals("y") );
		
		//input.close();
	}
}