/** 
*The purpose of this class is represent a Person
*Added Component:  adding static attribute numOfPerosns
*@author khandan
*/

public class Person {
	
	private static int numOfPerosns;    //Static member to keep track of the number of Person Objects that are getting created
	private String name;
	 

	/**
	 * @param numOfPerosns the numOfPerosns to set
	 */
	public static void setNumOfPerosns(int numOfPerosns) {
		Person.numOfPerosns = numOfPerosns;
	}
	private int age;
	private double minWage;

	/**
	 * no-arg constructor, creates a Person
	 * object with noname , age of 1 and minWage of 10
	 */
	public Person()
	{
		name = "noname";
		age = 1;
		minWage = 10.0;
		numOfPerosns++;  //increment the static member 
	}
	 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age of 1 and minWage of 10
	 * @param name name of the person
	 */
	public Person(String name)
	{
		this.name = name;
		age = 1;
		minWage = 10.0;
		numOfPerosns++;  //increment the static member 
	}
 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age  and minWage  
	 * @param name name of the person
	 * @param age person's age
	 * @param minWage minimum wage
	 */
	public Person(String name, int age, double minWage)
	{
		this.name = name;
		this.age = age;
		this.minWage = minWage;
		numOfPerosns++;  //increment the static member 
	}
	
	/**
	 * sets the name of the person
	 * @param name the name of the person
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * gets  the name of the person
	 * returns the person's name
	 */
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
	
	/**
	 * @return the numOfPerosns
	 */
	public static int getNumOfPerosns() {  
		return numOfPerosns;
	}
	/**
	 * displays the name and the age of the person
	 * 
	 */
	public void SayName() {
		System.out.println("My name is " + name + " and my age "
							+ "is " + age);
	}
	/**
	 * increments age of the person
	 * @param name the name of the person
	 */
	public void HaveBirthday() {
		age++;
	}
	
	/**
	 * increases the minWage by a percentage 
	 * value passed as parameter to this method
	 * @param perc the percentage value
	 */
	public void increaseWage(double perc) {
		minWage = (minWage * perc)/100 + minWage;
	}
	
	/**
	 * toString method returns a String 
	 * representing a Person object
	 * @return returns String representation of object
	 */
	@Override
	public String toString()
	{
		return "The person's name is " + 
				name + " and their age is " + age;
	}
	/**Checks if this Person is equal to another person object
	 * @param anotherPerson an Object to be compared with this object 
	 * @return returns true if all the attributes of this object is equal to anotherPerson, false otherwise
	 */
	@Override
	 
	public boolean equals( Object anotherPerson) 
	{
		if ( !(anotherPerson instanceof Person) )  //Check if anotherPerson is an instance of Person
			                                       //because any object technically is a an instance of the superclass Object
			return false;
	
		Person tempPerson = (Person)anotherPerson;   //Cast to a Person type
		
		if ( this.name.equals(tempPerson.name) && 
				           this.age == (tempPerson.age) && 
				           this.minWage == (tempPerson.minWage))
			return true;
		
		return false;
	}
	
}