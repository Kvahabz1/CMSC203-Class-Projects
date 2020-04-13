
public class LearningAssistant extends Student {

	private double payRate;
	private double hrsWorked;
	/**
	 * @param payRate
	 * @param hrsWorked
	 */
	public LearningAssistant(String name , int age, String stId, double payRate, double hrsWorked) {
		super(name, age ,stId);
		this.payRate = payRate;
		this.hrsWorked = hrsWorked;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "payRate=" + payRate + ", hrsWorked=" + hrsWorked;
	}

	@Override 
	public double pay()
	{
		return 	payRate * hrsWorked ;

	}
	
}
