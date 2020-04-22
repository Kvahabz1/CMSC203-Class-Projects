
public class Circle extends Shape  implements ShapeInterface{
	private double r;
	
	public Circle(String n, String c, double r)
	{
		super(n,c);
		this.r = r;
	}

	@Override
	public double calcArea() {
		
		return Math.PI * Math.pow(r, 2);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " radius: " + r;
	}
	public void someMethod()
	{
		System.out.println("This is a method for Circle Class");
	}

	@Override
	public void rotate(int degree) {
		System.out.println(" rotated by " + degree);
		
	}

}
