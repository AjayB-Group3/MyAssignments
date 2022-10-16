package week3.day2;

public class MyBankAccount {

	public static void main(String[] args) {

		HDFC hdfc =new HDFC();
		hdfc.miniumumBalance(5000);
		hdfc.provideCreditCard("Platinum Credit Card");
		hdfc.provideDebitCard("VISA Debit Card");
		
		System.out.println("*****************");
		
		RBI rbi =new HDFC();
		rbi.miniumumBalance(5000);
		//rbi.provideCreditCard("Platinum Credit Card");
		rbi.provideDebitCard("VISA Debit Card");
		
		
	}

}
