package problem3;

public class SBI extends Bank{
	

	public SBI(int rate) {
		super(rate);
	this.interestRate=rate;
	}
	
	public static void getRateOfInterest(){
		System.out.println(interestRate);
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI(10);
		
		getRateOfInterest();
		
	

}
}
