import java.text.DecimalFormat;

/**  	CMSC203 Assignment 2 Spring 2016 
 * The Toy class will keep the cost for one of three different toys: 
 * a plushie, a book, and blocks.
 * It will determine if the toy is age-appropriate for a child.
 * 
 * @author Ida Justh
 */

public class Toy
{ 		
	/** cost for the plushie */
	 final double PLUSHIE = 25.0;
	 
	 	/** cost for the book */
	 final double BOOK = 15.0;
	 
	 	/** cost for blocks */
	 final double BLOCKS = 20.0;
	 
	 	/** cost for a card */
	 final double CARD = 2.95;
	 
	 	/** cost for a balloon */
	 final double BALLOON = 6.0;
	 
	private String toy;		// the toy to purchase
	private double cost;	// the cost of the entire toy purchase
	private int age;		// the age of the child
	
	DecimalFormat dollar = new DecimalFormat("#,##0.00");	//format cost
	
		/** no-arg constructor */
	public Toy()
	{
		toy = "";
		cost = 0;
		age = 0;
	}
	
		/** constructor initializes toy and age to values input from the user, 
		 * cost to appropriate constant 
		 * 
		 * @param t  the toy requested
		 * @param a  the age of the child
		 */
	public Toy(String t, int a)
	{
		setToy(t);
		setAge(a);
		setCost(t);
	}
	
	   	/** change the toy to be used
    	 * 
    	 * @param t  Change the toy 
    	 */
    public void setToy(String t)
    {
    	if (t.toLowerCase().equals("plushie"))
         	toy = "plushie";        	
       	else if (t.toLowerCase().equals("book"))
     		toy = "book";
        else if (t.toLowerCase().equals("blocks"))
    		toy = "blocks"; 	
        else
        	toy = "";
    }
  
       	/** change the age of the child
    	 * 
    	 * @param a  the age of the child to receive the toy
    	 */
    public void setAge(int a)
    {
    	age = a;
    }
    
    	/**  change the cost to the cost of only the gift with no add-ons
    	 * @param t  the original cost of the toy
    	 */
    public void setCost(String t)
    {
    	if (t.toLowerCase().equals("plushie"))
    		cost = PLUSHIE;
 		else if (t.toLowerCase().equals("book"))
			cost = BOOK;
 		else if (t.toLowerCase().equals("blocks"))
 			cost = BLOCKS;
 		else
 			cost = 0;
    } 
    
    	/** get the string representing the toy
    	 * 
    	 * @return the name of the toy requested 
    	 */
    public String getToy()
    {
    	return toy;
    }
    
    	/** get the age of the child that corresponds to the toy
    	 * 
    	 * @return the age of the child
    	 */
    public int getAge()
    {
    	return age;
    }
    
    	/** get the cost of the toy requested (may include add-ons)
    	 * 
    	 * @return the cost of the toy
    	 */
    public double getCost()
    {
    	return cost;
    }
    
		/** determines age-appropriate for the toy:
		 * plushie: 0 to 2 years
		 * book: 4 to 7 years
		 * blocks: 3 to 5 years
		 * @return true if toy matches age range and false otherwise.
		 */
    public boolean ageOK()
    {
    	if (toy.equalsIgnoreCase("plushie") && (age >= 0 && age <= 2))
    		return true;
    	else if(toy.equalsIgnoreCase("blocks") && (age >= 3 && age <= 5))
    		return true;
    	else if(toy.equalsIgnoreCase("book") && (age >= 4 && age <= 7))
    		return true;
    	else
    		return false;
    }
    
		/**  add a card to the gift
		 * update the cost of the gift
		 * @param s
		 */
	public void addCard(String s)
	{
	if(s.equalsIgnoreCase("yes"))
		addCost(CARD);
	}
	
		/**add a balloon to the gift
		 * update the cost of the gift
		 * @param s
		 */
	public void addBalloon(String s)
	{
	if (s.equalsIgnoreCase("yes"))
		addCost(BALLOON);
	}
	
		/** change the cost of the gift when a card or balloon is added
		*
		* @param c cost of card or balloon 
		*/
	public void addCost(double c)
	{
	cost += c;
	}
	
		/**  gives a string representation of the instance variables
		 * 	@return the instance variables as a string with cost formatted for currency
		 */
    public String toString()
    {
    	if (toy.equals("plushie")) toy="a plushie";
    	else if (toy.equals("book")) toy="a book";
    	else toy="a block";
    	
    	return " at " + age + " years old is " + toy + " for $" + dollar.format(getCost());
    }  
}
