
public class ClassDemo {
	public static void main(String[] args) {
		Person a = new Person();
		
		System.out.println(a.getName());
		
		a.setName("Bob");
		
		System.out.println(a.getName());
		
		a.setAge(21);
		
		System.out.println(a.getAge());	
		// create object named b with name Kim
		Person b = new Person("Kim");
		System.out.println(b.getName());
		System.out.println(b.getAge());	
		
		Person c = new Person("John", 40);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		//Create another person object d, 
		//ask for user to select name and age
	
	}
}