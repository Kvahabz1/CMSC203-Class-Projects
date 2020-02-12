/**
 * This class represent a Car class
 * @author Elizabeth
 *
 */
public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	/**
	 * Parameterized Constructor 
	 * @param y Year of the model
	 * @param m  make of the Car
	 */
	public Car(int y, String m) {
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	public int getYearModel() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	/**
	 * bumps up the speed by 5
	 */
	public void accelerate() {
		speed += 5;
	}
	/**
	 *  decreases the speed by 5
	 */
	public void brake() {
		speed -= 5;
	}
}
