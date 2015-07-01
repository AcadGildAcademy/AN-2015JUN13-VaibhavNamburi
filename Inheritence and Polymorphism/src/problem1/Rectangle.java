package problem1;

public class Rectangle {
	int height;
	int width;
	




	protected  Rectangle(int height, int width){
		
		this.height=height;
		this.width=width;	
	}
	
	protected int getArea(){
		return height*width;
	}
	
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4,10);
		
		
	}

}
