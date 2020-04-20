/** 
*The purpose of this class is represent a Person
*@author khandan
*/

public abstract class Person  implements Comparable <Person>{
	
	private String name;
	private int age;
	 
	/**
	 * no-arg constructor, creates a Person
	 * object with noname , age of 1  
	 */
	public Person()
	{
		name = "noname";
		age = 1;
		 
	}
	 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age of 1  
	 * @param name name of the person
	 */
	public Person(String name)
	{
		this.name = name;
		age = 1;
		 
	}
 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age  and minWage  
	 * @param name name of the person
	 * @param age person's age
	 
	 */
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	 
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
	 * 
	 * @return the amount of pay
	 */
	public abstract double pay();
	 
	
	/**
	 * toString method returns a String 
	 * representing a Person object
	 * @return returns String representation of object
	 */
	@Override
	public String toString()
	{
		return "The person's name is " + 
				name + " and the age is " + age;
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
				           this.age == (tempPerson.age) )
			return true;
		
		return false;
	}
	
}