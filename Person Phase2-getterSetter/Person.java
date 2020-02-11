public class Person {
	// fields
	private String name;
	private int age;

	// methods
	// setter method
	public void setName(String name)
	{
		this.name = name;
	}
	// getter method
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void SayName() {
		System.out.println("My name is " + name + " and my age "
							+ "is " + age);
	}

	public void HaveBirthday() {
		age++;
	}
}