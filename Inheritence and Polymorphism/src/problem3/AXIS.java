package problem3;

public class AXIS extends Bank{
	
	public AXIS(int rate) {
		super(rate);
	this.interestRate=rate;
	}
	
	public static void getRateOfInterest(){
		System.out.println(interestRate);
	}

	public static void main(String[] args) {
		AXIS axis = new AXIS(8);
		
		getRateOfInterest();
	}

}
