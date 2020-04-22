  public class Rec extends Shape implements ShapeInterface{
	  private double h;
	  private double w;
	  
	  public Rec(String name, String color, double h, double w)
	  {
		  super (name,color);
		  this.h = h;
		  this.w = w;
	  }

	@Override
	public double calcArea() {
		
		return h * w;
	}

	@Override
	public void rotate(int degree) {
		// TODO Auto-generated method stub
		
	}
	  

}
