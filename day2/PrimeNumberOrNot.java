package week1.day2;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int input = 97;
		boolean flag = true;
		for(int i=2;i<input;i++){
			if(input%i==0){
				System.out.println(input+" is not prime number");
				flag= false;
				break;
			}
		}
		if(flag){
			System.out.println(input+" is a prime number");
		}
	}

}
