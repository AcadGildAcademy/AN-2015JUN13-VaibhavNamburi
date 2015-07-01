package problem1;

public class Triangle extends Rectangle {
	
	
	private Triangle(int height, int width){
		super(height, width);
		this.height=height;
		this.width=width;
	}
	
	@Override
	protected int getArea(){
		return (int) (width*height*0.5);
	}

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 10);
		Triangle triangle = new Triangle(4,10);
		
		System.out.println(triangle.getArea());
		System.out.println(rectangle.getArea());

	}

}
