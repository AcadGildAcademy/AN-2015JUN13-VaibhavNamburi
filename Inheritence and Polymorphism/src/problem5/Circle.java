package problem5;

public class Circle implements Shape{
	double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public static void main(String[] args) {
		double rad = getRadius();
		Circle c1 = new Circle(rad);
		
		
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}
	
	public static double getRadius(){
		return 10;
	}

	@Override
	public void getArea() {
		
		
	}

}
