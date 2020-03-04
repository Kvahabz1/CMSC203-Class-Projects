/**
 * Represents A Person Object with name age and minwage
 * and the cities person lived in
 * @author KVAHABZ1
 *
 */

public class Person {
	
	private String name;
	private int age;
	private double minWage;
	private String [] citiesLivedIn;  //array to keep the cities that this person has lived in
	private int numOfCities;  //Keeps track of the number of cities in the citiesLivedIn.
	private int DEFAULT_SIZE=  5;  // default size of the  citiesLivedIn;

	/**
	 * no-arg constructor, creates a Person
	 * object with noname , age of 1 and minWage of 10
	 * the citiesLivedIn with the default size is created
	 */
	public Person()
	{
		name = "noname";
		age = 1;
		minWage = 10.0;
		citiesLivedIn = new String[DEFAULT_SIZE];
	}
	 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age of 1 and minWage of 10
	 * the citiesLivedIn with the default size is created
	 * @param name name of the person
	 */
	public Person(String name)
	{
		this.name = name;
		age = 1;
		minWage = 10.0;
		citiesLivedIn = new String[DEFAULT_SIZE];
	}
 
	/**
	 * parameterized constructor, creates a Person
	 * object with a name , age  and minWage  
	 * the citiesLivedIn with the default size is created
	 * @param name name of the person
	 * @param age person's age
	 * @param minWage minimum wage
	 */
	public Person(String name, int age, double minWage)
	{
		this.name = name;
		this.age = age;
		this.minWage = minWage;
		citiesLivedIn = new String[DEFAULT_SIZE];
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
	 * returns the default size of the array
	 * @return  default size of the array citiesLivedin
	 */
	public int getDefaultSize()
	{
		return DEFAULT_SIZE;
	}
	
	/**
	 * returns the array of citiesLivedin
	 * @return  the array of citiesLivedIn
	 */
	public String[] getcitiesLivedIn()
	{
	 	return citiesLivedIn;   
		/*
		 * Another option would be to return the copy of 
		 * the array to avoid another class to change the 
		 * content of the citiesLivedIn array
		 */
		 /*
		   
		
		String [] tempCities = new String[citiesLivedIn.length];   //create a another array that has the same size of the original array
		for ( int i = 0; i<citiesLivedIn.length; i++ )  //copy the content to this array
			  
		{
			tempCities[i] = citiesLivedIn[i];
		}
		return 	tempCities;
		*/
	  
	}
	/*
	 * Adds the city to the list of citiesLivedIn array
	 * @param city name of the city to be added to the array
	 */
	public void addCity(String city)
	{
		citiesLivedIn[numOfCities] = city;
		numOfCities++;
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
	public String toString()
	{
		return "The person's name is " + 
				name + " and their age is " + age;
	}
	/**
	 * citiesLivedIn method returns a String 
	 * representing list of cities 
	 * @return returns String representation of cities in 
	 */
	public String citiesLivedIn()
	{
		String temp = "";
		for ( int i=0; i< numOfCities; i++)
			temp +=citiesLivedIn[i] + " ";
		return temp;
	}
}