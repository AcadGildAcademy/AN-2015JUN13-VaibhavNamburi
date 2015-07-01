package problem3;

public class ICICI extends Bank{
	
	public ICICI(int rate) {
		super(rate);
	this.interestRate=rate;
	}

	public static void getRateOfInterest(){
		System.out.println(interestRate);
	}
	
	public static void main(String[] args) {
		ICICI sbi = new ICICI(6);
		getRateOfInterest();
	}

}
