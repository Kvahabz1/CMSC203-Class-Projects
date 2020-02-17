public class Person {
	// fields
	private String name;
	private int age;
	private double minWage;

	// methods
	//no-arg constructor method
	public Person()
	{
		name = "noname";
		age = 1;
		minWage = 10.0;
	}
	//parameterized constructor
	public Person(String name)
	{
		this.name = name;
		age = 1;
		minWage = 10.0;
	}
	// parameterized constructor to set
	// name and age
	public Person(String name, int age, double minWage)
	{
		this.name = name;
		this.age = age;
		this.minWage = minWage;
	}
	
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
	public void setWage(double minWage)
	{
		this.minWage = minWage;
	}
	public double getWage()
	{
		return minWage;
	}
	public void SayName() {
		System.out.println("My name is " + name + " and my age "
							+ "is " + age);
	}

	public void HaveBirthday() {
		age++;
	}
	
	public void increaseWage(double perc) {
		minWage = (minWage * perc)/100 + minWage;
	}
	
	/**
	 * toString method returns a String 
	 * representing a Person object
	 * @return returns String representation of object
	 */
	public String toString()
	{
		return "The person's name is " + 
				name + " and their age is " + age;
	}
}