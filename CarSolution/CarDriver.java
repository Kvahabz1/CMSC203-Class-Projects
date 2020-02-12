
public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car(2020, "Honda");
		
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());

	}

}
