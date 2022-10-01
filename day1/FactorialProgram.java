package week1.day1;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner (System.in);
		System.out.print("Enter the Factorial Number:");
		int input=s1.nextInt();
		
		int fact=1;
		 		 
		 for(int i=1;i<=input;i++) 
		 { fact = fact * i;
		 }
		  
		 System.out.println("The Factorial of "+input +" is "+ fact);
		 
	}

}
