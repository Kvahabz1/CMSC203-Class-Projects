/**
 * Represents an Instructor object
 * @author KVAHABZ1
 *
 */
public class Instructor extends Person {
	private String instId;  //Instructor ID
	private double payRate;  //payRate
	private double hrsWorked;  // hours worked
	 
	/**
	 * Constructor
	 * @param name
	 * @param age
	 * @param instId
	 * @param payRate
	 * @param hrsWorked
	 */
	
	public Instructor(String name , int age , String  instId, double payRate, double hrsWorked) {
		super(name, age);
		this.instId = instId;
		this.payRate = payRate;
		this.hrsWorked = hrsWorked;
	}

	@Override
	public String toString() {
		return super.toString() + "instId=" + instId + ", payRate=" + payRate + ", hrsWorked=" + hrsWorked;  
	}
	/**
	 * 
	 * @return the amount of pay 
	 */

	@Override 
	public double pay()
	{
		return payRate * hrsWorked;
	}
	
	
	
	
}
