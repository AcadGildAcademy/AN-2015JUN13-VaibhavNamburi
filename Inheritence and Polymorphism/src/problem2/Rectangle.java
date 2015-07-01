package problem2;

public class Rectangle {
	int height;
	int width;
	int result;
	public Rectangle(){
		this.height=0;
		this.width=0;
		
	}
	
	public Rectangle(int x){
		this.height=x;
		this.width=x;
	}
	
	public Rectangle( int y, int x){
		this.height=y;
		this.width=x;
	}
	
	private void getArea(){
		System.out.println(width*height); 
	}
	public static void main(String[] args) {
		
		Rectangle rect= new Rectangle();
		Rectangle rect1 = new Rectangle(5);
		Rectangle rect2 = new Rectangle(5, 10);
		
		rect.getArea();
		rect1.getArea();
		rect2.getArea();
		
		
		
		
		
	}

}
