package problem5;

public class Rectangle implements Shape{
	static int width=10;
	static int height=10;
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.getArea();
		
		
		
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}

	public  void getArea() {
		System.out.println(height*width);
		
	}

	
	
}
