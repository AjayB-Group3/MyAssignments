package overrideMethodExample;

public class AxisBank extends Bankinfo {
	
	public void deposit() {
		System.out.println("No amount is deposited");
		super.deposit();
	}
	
	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.fixed();
		bank.savings();

	}

}
