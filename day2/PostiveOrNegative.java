package week1.day2;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {

	
		Scanner enterNumber = new Scanner(System.in);
		int Number = enterNumber.nextInt();
		
		//System.out.print("Enter the Number "+Number);
				
		
		
		if(Number > 0) 
		{
			System.out.print("The Number is Positive");
		}
		else if (Number<=0) 
		{
			System.out.print("The Number is Negative");
		}
	}

}
